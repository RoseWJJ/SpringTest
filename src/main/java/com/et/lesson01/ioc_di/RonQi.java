package com.et.lesson01.ioc_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class RonQi {
	public static void main(String[] args) {
//		//��������
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		A a = (A)context.getBean("a");
//		System.out.println(a);
//		B b = (B)context.getBean("springlesson01.B");// ��������û�����ֵĻ�ֻ��ȡ����һ��
////		B b = (B)context.getBean(B.class);//��ֻ����һ��
//		System.out.println(b);
//		//���û��ָ��id���࣬Ĭ�ϵ������� ����#���
//		String [] arr = context.getBeanDefinitionNames();
//		for (String t : arr) {
//			System.out.println(t);
//		}
		
		
		
		
		//FileSystemXmlApplicationContext ���ļ�ϵͳ��Ѱ��xml�ļ� ���̷� 
		//ClassPathXmlApplicationContext ����·������  ����
		//GenericApplicationContext ͨ��  Ĭ�ϲ�����·��
		//WebApplicationContext web.xml��ʵ����
		//�ͽ�ԭ��  ����ApplicationContext ָ�֧���ַ���������ҷ���
		//classpath:  
		//file:
//		ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
//		A a = (A)context.getBean("a");
//		System.out.println(a);
//		B b = (B)context.getBean("springlesson01.B");// ��������û�����ֵĻ�ֻ��ȡ����һ��
////		B b = (B)context.getBean(B.class);//��ֻ����һ��
//		System.out.println(b);
//		//���û��ָ��id���࣬Ĭ�ϵ������� ����#���
//		String [] arr = context.getBeanDefinitionNames();
//		for (String t : arr) {
//			System.out.println(t);
//		}
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:/com/et/lesson01/ioc_di/spring.xml");
//		A a = (A)context.getBean("a1");
//		System.out.println(a);
//		System.out.println(a.getName());
//		B b = (B)context.getBean("b1");// ��������û�����ֵĻ�ֻ��ȡ����һ��
//		System.out.println(b);
//		System.out.println(b.getA().getName());
//	
		C c = (C)context.getBean("c");
		System.out.println(c);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getB().getA().getName());
	}
}
