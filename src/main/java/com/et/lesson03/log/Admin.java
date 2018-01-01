package com.et.lesson03.log;

import org.springframework.stereotype.Component;

@Component
public class Admin {
	public void add(){
		System.out.println("添加商品");
	}
	public void delete(){
		System.out.println("删除商品");
	}
}
