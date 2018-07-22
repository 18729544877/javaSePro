package com.se.object;

class Che {
	public String color; // 车具有的特性：颜色
	public int speed; // 车具有的特性：时速
	// 车具有的功能：运行。

	public void canRun() {
		System.out.println("我能跑");
	}

	// 车具有的功能：停止。
	public void canStop() {
		System.out.println("我能停止");
	}
}

public class Test12 {
	public static void main(String[] args) {
		args = new String[3];
		args[0]= "收费站";
		
		Che a = new Che();
		a.color = "黑色";
		a.speed = 80;
	//	a.canRun();
		System.out.println(">>");
		if (args[0].equals("收费站"))
			a.canStop();
		else
			a.canRun();
		
		Che a1 = new Che();
		a1.color = "黑色";
		a1.speed = 80;
		a1.canRun();
		if (args[0].equals("收费站"))
			a1.canStop();
		else
			a1.canRun();
	}
}