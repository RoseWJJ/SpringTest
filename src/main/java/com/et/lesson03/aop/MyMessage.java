package com.et.lesson03.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyMessage {
	public void add(){
		System.out.println("���ס����Ϣ");
	}
	public void delete(){
		System.out.println("ɾ��ס����Ϣ");
	}
	public void worn(JoinPoint jp){
		System.out.println(jp.getSignature().getName());
		System.out.println("�쳣");
	}
}
