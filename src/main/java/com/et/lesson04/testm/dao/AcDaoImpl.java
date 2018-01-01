package com.et.lesson04.testm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AcDaoImpl {
	@Autowired
	JdbcTemplate jdbc;
	@Autowired
	BcDaoImpl b;
	public void changeA(int money) throws Exception {
		String sql = "update mymoney set lostedmoney = lostedmoney - " + money
				+ " where ID = 1";
		jdbc.execute(sql);
		b.changeB(money);
		int i = 5/0;
	}
}
