package com.et.spring.lesson02.jdbc;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class RonQi {
	static JdbcTemplate jdbcTemplate;
	static{
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/com/et/spring/lesson02/jdbc/spring.xml");
		DataSource dataSource =(DataSource)context.getBean("dataSouce");
		jdbcTemplate =(JdbcTemplate) context.getBean("jdbcTemplate");
		
	}
	public static void main(String[] args) throws Exception {
		query("select * from mynews");
		delete();
		query("select * from mynews");
		
	}
	public static void query(String sql){
		
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		System.out.println(list.size());
		for (Map l : list) {
			System.out.println(l);
		}
	}
	public static void delete(){
		String sql="delete from mynews where newid = 1";
		jdbcTemplate.execute(sql);
		
	}
}
