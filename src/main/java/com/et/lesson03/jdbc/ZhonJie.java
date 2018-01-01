package com.et.lesson03.jdbc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ZhonJie implements InvocationHandler {
	/**
	 * �н������
	 */
	HouseOwer houseOwer;
	
	/**
	 * �н��÷������ⷿȨ��
	 */
	public ZhonJie(HouseOwer houseOwer){
		this.houseOwer = houseOwer;
	}
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("�н������");
		System.out.println("�����");
		Object obj = method.invoke(houseOwer, args);
		System.out.println("���뷿��");
		return obj;
	}

}
