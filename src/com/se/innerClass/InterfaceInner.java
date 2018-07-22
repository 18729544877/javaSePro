package com.se.innerClass;

public class InterfaceInner {
public static void main(String[] args) {
	Outers.method().showInfo();
}
}
class Outers{
public static Inner1 method() {//接口匿名内部类
	return new Inner1(){
		public void showInfo() {
			System.out.println("这是实现类的showInfo方法");
		}
	};
}
}
 interface Inner1{
	void showInfo();
}