package com.et.lesson03.aop;

import org.springframework.stereotype.Component;

@Component
public class AfHouseOwner {

	public void seekMyHouse() {
		System.out.println("我是   安防房东  我要  出租 一层楼");
		int i = 5/0;
	}
	
}
