package com.se.object;



public class FanXingDemo {
	public static void main(String[] args) {
		FanXing<String>   fx = new FanXing<String>();
		fx.setT("����");
		System.out.println(fx.getT());
		fx.show("��ϲ����");
		
		FanXing<String>   fx1 = new FanXing<String>();
		fx1.setT("����");
		System.out.println(fx1.getT());
	}



}
