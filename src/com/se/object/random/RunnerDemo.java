package com.se.object.random;

public class RunnerDemo implements Runnable {

	public static void main(String[] args) {
		new RunnerDemo().run();
		System.out.println("������");
		new RunnerDemo().show();
		showInfo();
	}

	@Override
	public void run() {
		System.out.println("helloworld");
	}

	public void show() {
		System.out.println("����show�����Ĳ���");
	}

	public static void showInfo() {
		System.out.println("���Ǿ�̬��showInfo�ķ���");
	}
}
