package fr.cap.wikimnv.global.aspect;

import java.util.Calendar;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.cap.wikimnv.exception.MNVException;

public class LoggerMNV {

	
	Logger log = LoggerFactory.getLogger(LoggerMNV.class);

	public void logEvent(JoinPoint joinPoint) {
		log.info(joinPoint.getThis().getClass().getSimpleName(), joinPoint.getArgs().length);
	}

	public Object logProcess(ProceedingJoinPoint joinPoint) {
		Object object = null;
		try {
			log.info(Calendar.getInstance().getTimeInMillis() + " - Start....."  + joinPoint.getSignature().toString());
			object = joinPoint.proceed();
			log.info(Calendar.getInstance().getTimeInMillis() + " - End....."  + joinPoint.getSignature().toString());
		} catch (MNVException e) {
			log.debug(e.getCodeErreur() + " : " + e.getMessage());
		}catch (Throwable e) {
			log.debug("Erreur non traitée : " + joinPoint.getSignature().toString() + " : " + e.getMessage());
		}
		return object;
	}

}
