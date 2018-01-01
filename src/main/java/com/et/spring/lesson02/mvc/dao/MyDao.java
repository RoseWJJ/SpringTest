package com.et.spring.lesson02.mvc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MyDao {
	@Autowired
	private JdbcTemplate template;

	public List<Map<String,Object>> queryMyResult(String sql) {
		System.out.println(sql);
		return template.queryForList(sql);
	}
}
