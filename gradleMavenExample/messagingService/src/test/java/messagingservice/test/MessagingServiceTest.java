package messagingservice.test;

import static org.junit.Assert.*;
import messagingservice.MessagingService;

import org.junit.Before;
import org.junit.Test;

public class MessagingServiceTest {
	
	private MessagingService messageService;
	
	@Before
	public void setUp(){
	
		messageService = new MessagingService();
	}
	
	@Test
	public void getMessage_Check(){
		assertEquals("Hello World", messageService.sayHello());
	}

}
