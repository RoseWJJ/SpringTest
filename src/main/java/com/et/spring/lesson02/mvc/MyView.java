package com.et.spring.lesson02.mvc;


import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.et.spring.lesson02.mvc.controller.MyController;
import com.et.spring.lesson02.mvc.dao.MyDao;

public class MyView {
	static ConfigurableApplicationContext context;
	static {
		context = new GenericXmlApplicationContext(
				"classpath:/com/et/spring/lesson02/mvc/a.xml");

	}
	private MyDao myDao;
	private static MyController con;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				System.out.print("«Î ‰»Îsql”Ôæ‰");
				String sql = scanner.nextLine();
				con = (MyController)context.getBean("myController");
				
				con.service(sql);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			context.close();
		}
	}
}
