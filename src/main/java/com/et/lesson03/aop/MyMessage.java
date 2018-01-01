package com.et.lesson03.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyMessage {
	public void add(){
		System.out.println("添加住户信息");
	}
	public void delete(){
		System.out.println("删除住户信息");
	}
	public void worn(JoinPoint jp){
		System.out.println(jp.getSignature().getName());
		System.out.println("异常");
	}
}
