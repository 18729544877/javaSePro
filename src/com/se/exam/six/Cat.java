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
		System.out.println("姓名：" + name + "年龄：" + age);
	}

	@Override
	public void eat() {
		System.out.println("猫在吃老鼠");
	}

	// 实现way接口部分
	@Override
	public void jiao() {
		System.out.println("猫会喵喵叫");
	}

	@Override
	public void walk() {
		System.out.println("猫会走猫步");
	}

}
