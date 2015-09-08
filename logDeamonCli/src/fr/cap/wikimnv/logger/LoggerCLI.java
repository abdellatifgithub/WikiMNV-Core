package fr.cap.wikimnv.logger;

import fr.cap.wikimnv.logmanager.LoggerService;
import fr.cap.wikimnv.logmanager.LoggerService_Service;

public class LoggerCLI{
	private  LoggerService_Service logserv = null;
	public LoggerCLI() {
		
	}
	
	public  LoggerService_Service getLogserv() {
		
		return logserv;
	}

	public  LoggerService getLogger() {
		if(logserv == null)
			logserv = new LoggerService_Service();
		return logserv.getLoggerServicePort();
	}
}
