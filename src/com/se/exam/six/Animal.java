package com.se.exam.six;

/*6.	������->��->������->�ӿ����򵥰��������ݺ����߼���������*/
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
