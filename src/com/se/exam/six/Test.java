package com.se.exam.six;

public class Test {
	public static void main(String[] args) {
		Cat cat = new Cat("С��", 3);
		cat.showInfo();
		cat.eat();
		cat.jiao();
		cat.walk();

		Dog d = new Dog("����", 3);
		d.showInfo();
		d.eat();
		d.look();
		d.jiao();
		d.walk();
	}
}
