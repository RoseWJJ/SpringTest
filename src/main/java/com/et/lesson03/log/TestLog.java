package com.et.lesson03.log;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
/**
 * spring 实现aop用了两种技术
 * 	1 java动态代理（面向接口）
 *  2 cglib实现动态代理（）
 * @author THINK
 *
 */

public class TestLog {
	static ConfigurableApplicationContext context;
	static {
		context = new GenericXmlApplicationContext(
				"classpath:com/et/lesson03/log/spring.xml");

	}

	public static void main(String[] args) throws Exception {
		User user= (User) context.getBean("user");
		user.login();
		user.buy();
		Admin admin= (Admin) context.getBean("admin");
		admin.add();
		admin.delete();
	}
}
