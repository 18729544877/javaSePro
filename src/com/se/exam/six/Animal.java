package com.se.exam.six;

/*6.	测试类->类->抽象类->接口做简单案例，内容合理，逻辑必须完整*/
abstract class Animal {
	String name;
	int age;

	public Animal() {
		super();
	}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public abstract void showInfo();

	public abstract void eat();
}
