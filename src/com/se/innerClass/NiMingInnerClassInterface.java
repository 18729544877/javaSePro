package com.se.innerClass;

public class NiMingInnerClassInterface{
	public static void main(String[] args){
		Outer2.method2().show();
	}
}

class Outer2{
	public static Inner2 method2(){
		return new Inner2(){
			public void show(){
				System.out.println("HelloWorld");
			}
		};
	}
}
interface Inner2{//����ӿ�
	void show();
}//�˴��Ľ�ڲ�����ʡ��