package com.et.lesson03.aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
/**
 * spring ʵ��aop�������ּ���
 * 	1 java��̬��������ӿڣ�
 *  2 cglibʵ�ֶ�̬������
 * @author THINK
 *
 */

public class Test {
	static ConfigurableApplicationContext context;
	static {
		context = new GenericXmlApplicationContext(
				"classpath:com/et/lesson03/aop/a.xml");

	}

	public static void main(String[] args) throws Exception {
		AfHouseOwner a= (AfHouseOwner) context.getBean("afHouseOwner");
		a.seekMyHouse();
	}
}
