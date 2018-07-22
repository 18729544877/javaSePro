package com.se.exam.six;

public class Dog extends Animal implements Way {

	public Dog() {
		super();
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	// 继承的父类的方法：
	@Override
	public void showInfo() {
		System.out.println("姓名：" + name + "年龄：" + age);
	}

	@Override
	public void eat() {
		System.out.println("狗吃骨头");
	}

	// 自己独有的方法
	public void look() {
		System.out.println("狗会看家");
	}

	// 实现way接口部分

	@Override
	public void walk() {
		System.out.println("狗会狂奔");
	}

	@Override
	public void jiao() {
		System.out.println("狗会汪汪叫");
	}

}
