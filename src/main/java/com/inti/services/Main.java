package com.inti.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//applicationContext.xml=>beans.xml
		//loading the definitions from the given XML file
				ApplicationContext context = new ClassPathXmlApplicationContext(
						"applicationContext.xml");
		 
				HelloWorldService service = (HelloWorldService) context
						.getBean("helloWorldService");
				String message = service.sayHello();
				System.out.println(message);
		 
				//set a new name
				service.setName("Spring1");
				message = service.sayHello();
				System.out.println(message);
	}

}
