package com.se.innerClass;



public class InnerTest2 {
	public static void main(String[] args){
		Outer1 o = new Outer1();
		o.method1();
		o.show2();
	}
}

class Outer1{
	public void method1(){
		class Inner{
			public void show2() {
				System.out.println("内部类的show2方法");
			}
			public void show(){
				System.out.println("内部类的 show方法");
			}
		}
		Inner i = new Inner();
		i.show();
		i.show2();
	}
	public void show2() {
		System.out.println("外部类的show2方法");
	}
}