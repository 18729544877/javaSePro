package com.se.innerClass;

public class InterfaceInner {
public static void main(String[] args) {
	Outers.method().showInfo();
}
}
class Outers{
public static Inner1 method() {//�ӿ������ڲ���
	return new Inner1(){
		public void showInfo() {
			System.out.println("����ʵ�����showInfo����");
		}
	};
}
}
 interface Inner1{
	void showInfo();
}