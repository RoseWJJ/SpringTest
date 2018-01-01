package com.et.lesson04.jdbc;

import java.sql.Connection;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
/**
 *  编程式事务
 *  声明式事务
 *  	 xml 全局
 *  	注解声明
 * @author THINK
 *
 */
public class RonQi {
	static DataSource dataSource;
	static Connection connection;

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new GenericXmlApplicationContext(
				"classpath:com/et/lesson04/jdbc/spring.xml");
		dataSource = (DataSource) context.getBean("dataSource");
		try {
			connection = dataSource.getConnection();
			connection.setAutoCommit(false);
			
			int i= 5/0;
			
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
			connection.rollback();
		}finally{
			connection.commit();
		}
	}

	
}
