package com.et.lesson01.autowrite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class RonQi {
	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:/com/et/lesson01/autowrite/spring.xml");
		B b =(B)context.getBean("b1");
		System.out.println(b);
		System.out.println(b.getA().getName());
	}
}
