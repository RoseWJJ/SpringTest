package com.et.spring.lesson02.anno;

public class A {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void ini() {
		System.out.println("容器创建bean之后调用 也就是说new完之后调用");
	}

	public void des() {
		System.out.println("容器销毁bean 本身的时候");
	}
}
