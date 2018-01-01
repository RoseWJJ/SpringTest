package com.et.spring.lesson02.cycle;

import org.springframework.stereotype.Component;
/**
 * 这个注解 让spring容器自动实例化当前类
 * id 就是 类名首字母小写
 * @author THINK
 *
 */
@Component
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
