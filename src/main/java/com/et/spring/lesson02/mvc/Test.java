package com.et.spring.lesson02.mvc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new GenericXmlApplicationContext(
				"classpath:/com/et/spring/lesson02/mvc/a.xml");
		X x = (X) context.getBean("xx");
		System.out.println(x.getId());
	}
}
