package fr.cap.wikimnv.logger;

import org.junit.Test;

import fr.cap.wikimnv.logmanager.Exception_Exception;
import fr.cap.wikimnv.logmanager.LogLevel;

public class LoggerCLITest {

	@Test
	public void testGetLogger() {
		try {
			(new LoggerCLI()).getLogger().logger(LogLevel.INFO, "OK");
		} catch (Exception_Exception e) {e.printStackTrace();}
	}

}
