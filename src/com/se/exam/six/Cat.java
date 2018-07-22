package com.se.exam.six;

public class Cat extends Animal implements Way {

	public Cat(String name, int age) {
		super(name, age);
	}

	public Cat() {
		super();
	}

	@Override
	public void showInfo() {
		System.out.println("������" + name + "���䣺" + age);
	}

	@Override
	public void eat() {
		System.out.println("è�ڳ�����");
	}

	// ʵ��way�ӿڲ���
	@Override
	public void jiao() {
		System.out.println("è��������");
	}

	@Override
	public void walk() {
		System.out.println("è����è��");
	}

}
