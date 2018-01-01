package com.et.spring.lesson02.cycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class RonQi {
	static ConfigurableApplicationContext context;
	static {
		context = new GenericXmlApplicationContext(
				"classpath:/com/et/spring/lesson02/anno/spring.xml");

	}

	public static void main(String[] args) throws Exception {
	
		context.close();
	}
}
