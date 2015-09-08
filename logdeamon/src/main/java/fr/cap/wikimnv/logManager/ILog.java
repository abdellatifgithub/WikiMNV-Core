package fr.cap.wikimnv.logManager;

import javax.jws.WebService;

@WebService(name="loggerService", serviceName="loggerService")
public interface ILog {
	public void logger(LogLevel logLvl, String message) throws Exception;
}
