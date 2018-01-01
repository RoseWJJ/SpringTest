package com.et.lesson04.testm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BcDaoImpl {
	@Autowired
	JdbcTemplate jdbc;

	public void changeB(int money) throws Exception {
		String sql = "update mymoney set lostedmoney = lostedmoney + " + money
				+ " where ID = 2";
		jdbc.execute(sql);
	}
}
