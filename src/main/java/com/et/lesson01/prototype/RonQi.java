package com.et.lesson01.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class RonQi {
	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:/com/et/lesson01/prototype/spring.xml");
		A a =(A)context.getBean("a");
		A a1=(A)context.getBean("a");
		
		System.out.println(a==a1);
	}
}
