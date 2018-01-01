package com.et.lesson03.jdbc;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		/**
		 * loader 类加载器
		 * interfaces 
		 */
		//被拦截的房东类
		AfHouseOwner af = new AfHouseOwner();
		
		//实现拦截
		ZhonJie zj = new ZhonJie(af);
		//中介代理对象
		HouseOwer h = (HouseOwer)Proxy.newProxyInstance(Test.class.getClassLoader(), af.getClass().getInterfaces(),zj );
		h.seekMyHouse();
	}
}
