package com.et.lesson01.ioc_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class RonQi {
	public static void main(String[] args) {
//		//容器对象
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		A a = (A)context.getBean("a");
//		System.out.println(a);
//		B b = (B)context.getBean("springlesson01.B");// 有两个都没有名字的话只能取到第一个
////		B b = (B)context.getBean(B.class);//类只能有一个
//		System.out.println(b);
//		//如果没有指定id的类，默认的名字是 类名#编号
//		String [] arr = context.getBeanDefinitionNames();
//		for (String t : arr) {
//			System.out.println(t);
//		}
		
		
		
		
		//FileSystemXmlApplicationContext 从文件系统中寻找xml文件 带盘符 
		//ClassPathXmlApplicationContext 从类路径下找  常用
		//GenericApplicationContext 通用  默认查找类路径
		//WebApplicationContext web.xml中实例化
		//就近原则  所有ApplicationContext 指令都支持字符串定义查找方案
		//classpath:  
		//file:
//		ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
//		A a = (A)context.getBean("a");
//		System.out.println(a);
//		B b = (B)context.getBean("springlesson01.B");// 有两个都没有名字的话只能取到第一个
////		B b = (B)context.getBean(B.class);//类只能有一个
//		System.out.println(b);
//		//如果没有指定id的类，默认的名字是 类名#编号
//		String [] arr = context.getBeanDefinitionNames();
//		for (String t : arr) {
//			System.out.println(t);
//		}
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:/com/et/lesson01/ioc_di/spring.xml");
//		A a = (A)context.getBean("a1");
//		System.out.println(a);
//		System.out.println(a.getName());
//		B b = (B)context.getBean("b1");// 有两个都没有名字的话只能取到第一个
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
