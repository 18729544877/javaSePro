package com.se.exam.six;

public class Dog extends Animal implements Way {

	public Dog() {
		super();
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	// �̳еĸ���ķ�����
	@Override
	public void showInfo() {
		System.out.println("������" + name + "���䣺" + age);
	}

	@Override
	public void eat() {
		System.out.println("���Թ�ͷ");
	}

	// �Լ����еķ���
	public void look() {
		System.out.println("���ῴ��");
	}

	// ʵ��way�ӿڲ���

	@Override
	public void walk() {
		System.out.println("�����");
	}

	@Override
	public void jiao() {
		System.out.println("����������");
	}

}
