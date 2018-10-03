package helloWorld;

import org.apache.log4j.Logger;

import loggingservice.LoggingService;
import messagingservice.MessagingService;



public class HelloWorld {
	
	
	public static void main(String[] args){
		MessagingService msgService= new MessagingService();
		LoggingService logService = new LoggingService();
		logService.logMessage(msgService.sayHello());
	}

}
