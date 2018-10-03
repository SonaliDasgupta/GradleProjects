package loggingservice;

import org.apache.log4j.Logger;

public class LoggingService {
	private static final Logger logger = Logger.getLogger(LoggingService.class);
	
	public void logMessage(String msg){
		logger.info(msg);
	}
}
