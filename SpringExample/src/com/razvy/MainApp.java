package com.razvy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

		objA.setMessage("I'm object A");
		objA.getMessage();
		objA = null;

		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		objB.getMessage();
		
		context.registerShutdownHook();
	}

}
