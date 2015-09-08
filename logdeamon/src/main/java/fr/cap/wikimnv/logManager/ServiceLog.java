package fr.cap.wikimnv.logManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceLog implements ILog {
	Logger log = LoggerFactory.getLogger(ServiceLog.class);

	public void logger(LogLevel logLvl, String message) throws Exception {
		switch (logLvl) {
		case DEBUG:
			log.debug(message);
			break;
		case INFO:
			System.out.println("info !!! " + message);
//			log.info(message);
			break;
		case WARN:
			log.warn(message);
			break;
		default:
			log.error(message);
			break;
		}
	}

}
