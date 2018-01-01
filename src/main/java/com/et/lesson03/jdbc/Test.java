package com.et.lesson03.jdbc;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		/**
		 * loader �������
		 * interfaces 
		 */
		//�����صķ�����
		AfHouseOwner af = new AfHouseOwner();
		
		//ʵ������
		ZhonJie zj = new ZhonJie(af);
		//�н�������
		HouseOwer h = (HouseOwer)Proxy.newProxyInstance(Test.class.getClassLoader(), af.getClass().getInterfaces(),zj );
		h.seekMyHouse();
	}
}
