package com.et.spring.lesson02.cycle;

import org.springframework.stereotype.Component;
/**
 * ���ע�� ��spring�����Զ�ʵ������ǰ��
 * id ���� ��������ĸСд
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
		System.out.println("��������bean֮����� Ҳ����˵new��֮�����");
	}

	public void des() {
		System.out.println("��������bean �����ʱ��");
	}
}
