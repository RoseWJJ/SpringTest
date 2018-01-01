package com.et.lesson04.testm;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.et.lesson04.testm.dao.AcDaoImpl;

public class TestDao {
	static AcDaoImpl AcDaoImpl;
	static{
		ApplicationContext context = new GenericXmlApplicationContext(
		"classpath:com/et/lesson04/testm/spring.xml");
		AcDaoImpl = (AcDaoImpl) context.getBean("acDaoImpl");
	}

	public static void main(String[] args) throws Exception {
		AcDaoImpl.changeA(10);
		
		
	}
}
