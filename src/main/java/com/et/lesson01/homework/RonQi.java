package com.et.lesson01.homework;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class RonQi {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/com/et/lesson01/homework/spring.xml");
		Connection connection =(Connection)context.getBean("con");
		System.out.println(connection);
	}
}
