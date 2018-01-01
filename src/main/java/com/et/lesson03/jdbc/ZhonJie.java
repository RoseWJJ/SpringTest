package com.et.lesson03.jdbc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ZhonJie implements InvocationHandler {
	/**
	 * 中介代理房东
	 */
	HouseOwer houseOwer;
	
	/**
	 * 中介获得房东的租房权限
	 */
	public ZhonJie(HouseOwer houseOwer){
		this.houseOwer = houseOwer;
	}
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("中介找租客");
		System.out.println("交租金");
		Object obj = method.invoke(houseOwer, args);
		System.out.println("搬入房子");
		return obj;
	}

}
