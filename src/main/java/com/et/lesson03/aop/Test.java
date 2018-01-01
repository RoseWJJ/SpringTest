package com.et.lesson03.aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
/**
 * spring 实现aop用了两种技术
 * 	1 java动态代理（面向接口）
 *  2 cglib实现动态代理（）
 * @author THINK
 *
 */

public class Test {
	static ConfigurableApplicationContext context;
	static {
		context = new GenericXmlApplicationContext(
				"classpath:com/et/lesson03/aop/a.xml");

	}

	public static void main(String[] args) throws Exception {
		AfHouseOwner a= (AfHouseOwner) context.getBean("afHouseOwner");
		a.seekMyHouse();
	}
}
