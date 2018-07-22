package com.se.object;



public class FanXingDemo {
	public static void main(String[] args) {
		FanXing<String>   fx = new FanXing<String>();
		fx.setT("张三");
		System.out.println(fx.getT());
		fx.show("恭喜过关");
		
		FanXing<String>   fx1 = new FanXing<String>();
		fx1.setT("李四");
		System.out.println(fx1.getT());
	}



}
