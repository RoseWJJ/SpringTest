package com.et.lesson03.aop;

import org.springframework.stereotype.Component;

@Component
public class AfHouseOwner {

	public void seekMyHouse() {
		System.out.println("����   ��������  ��Ҫ  ���� һ��¥");
		int i = 5/0;
	}
	
}
