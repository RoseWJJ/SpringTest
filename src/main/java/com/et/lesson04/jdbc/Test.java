package com.et.lesson04.jdbc;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.et.lesson04.jdbc.dao.MyMoneyDao;
/**
 *  ���ʽ����
 *  ����ʽ����
 *  	 xml ȫ��
 *  	ע������
 * @author THINK
 *
 */
public class Test {
	static MyMoneyDao myMoneyDao;
	static Connection connection;

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new GenericXmlApplicationContext(
				"classpath:com/et/lesson04/jdbc/spring.xml");
		myMoneyDao = (MyMoneyDao) context.getBean("myMoneyDaoImpl");
		myMoneyDao.changeA(10);
		myMoneyDao.changeB(10);
	}

	
}
