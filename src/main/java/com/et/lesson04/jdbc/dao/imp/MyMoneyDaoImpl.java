package com.et.lesson04.jdbc.dao.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.et.lesson04.jdbc.dao.MyMoneyDao;

@Repository
public class MyMoneyDaoImpl implements MyMoneyDao {
	//spring 利用 JdbcTemplate 来调用增删改查
	@Autowired
	JdbcTemplate jdbc;

	/* (non-Javadoc)
	 * @see com.et.lesson04.jdbc.dao.imp.MyMoneyDao#decreaseA(int)
	 */
	public void changeA(int money) throws Exception {
		String sql = "update mymoney set lostedmoney = lostedmoney - " + money
				+ " where ID = 1";
		jdbc.execute(sql);
	}

	/* (non-Javadoc)
	 * @see com.et.lesson04.jdbc.dao.imp.MyMoneyDao#increaseB(int)
	 */
	public void changeB(int money) throws Exception {
		String sql = "update mymoney set lostedmoney = lostedmoney + " + money
				+ " where ID = 2";
		jdbc.execute(sql);
	}
}
