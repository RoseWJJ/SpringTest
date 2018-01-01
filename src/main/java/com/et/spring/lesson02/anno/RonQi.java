package com.et.spring.lesson02.anno;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.et.lesson03.aop.AfHouseOwner;

public class RonQi {
	static ConfigurableApplicationContext context;
	static {
		context = new GenericXmlApplicationContext(
				"classpath:/com/et/spring/lesson02/cycle/spring.xml");

	}

	public static void main(String[] args) throws Exception {
		AfHouseOwner a= (AfHouseOwner) context.getBean("afHouseOwner");
		a.seekMyHouse();
	}
}
