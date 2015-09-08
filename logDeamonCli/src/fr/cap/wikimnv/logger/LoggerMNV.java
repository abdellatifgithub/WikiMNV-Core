package fr.cap.wikimnv.logger;

import java.util.Calendar;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import fr.cap.wikimnv.logmanager.Exception;
import fr.cap.wikimnv.logmanager.Exception_Exception;
import fr.cap.wikimnv.logmanager.LogLevel;
import fr.cap.wikimnv.logmanager.LoggerService;

public class LoggerMNV {

	LoggerCLI sLog;
	
	public LoggerMNV() {
		sLog = new LoggerCLI();
	}

	public void logEvent(JoinPoint joinPoint) {
			try {
				sLog.getLogger().logger(LogLevel.INFO, joinPoint.getThis().getClass()
						.getSimpleName()
						+ " : " + joinPoint.getArgs().length);
			} catch (Exception_Exception e) {
				
				e.printStackTrace();
			}
	}

	public Object logProcess(ProceedingJoinPoint joinPoint) throws Exception_Exception {
		
		Object object = null;
		try {
			sLog.getLogger().logger(LogLevel.INFO, Calendar.getInstance().getTimeInMillis()
					+ " - Start....." + joinPoint.getSignature().toString());
			object = joinPoint.proceed();
			sLog.getLogger().logger(LogLevel.INFO, Calendar.getInstance().getTimeInMillis()
					+ " - End....." + joinPoint.getSignature().toString());
		} catch (Throwable e) {
			sLog.getLogger().logger(
					LogLevel.DEBUG,
					"Erreur non traitée : "
							+ joinPoint.getSignature().toString() + " : "
							+ e.getMessage());
		}
		return object;
	}



}
