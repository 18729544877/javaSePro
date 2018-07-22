package com.se.object.random;

public class RunnerDemo implements Runnable {

	public static void main(String[] args) {
		new RunnerDemo().run();
		System.out.println("主方法");
		new RunnerDemo().show();
		showInfo();
	}

	@Override
	public void run() {
		System.out.println("helloworld");
	}

	public void show() {
		System.out.println("这是show方法的部分");
	}

	public static void showInfo() {
		System.out.println("这是静态的showInfo的方法");
	}
}
