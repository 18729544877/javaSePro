package com.se.object;

class Che {
	public String color; // �����е����ԣ���ɫ
	public int speed; // �����е����ԣ�ʱ��
	// �����еĹ��ܣ����С�

	public void canRun() {
		System.out.println("������");
	}

	// �����еĹ��ܣ�ֹͣ��
	public void canStop() {
		System.out.println("����ֹͣ");
	}
}

public class Test12 {
	public static void main(String[] args) {
		args = new String[3];
		args[0]= "�շ�վ";
		
		Che a = new Che();
		a.color = "��ɫ";
		a.speed = 80;
	//	a.canRun();
		System.out.println(">>");
		if (args[0].equals("�շ�վ"))
			a.canStop();
		else
			a.canRun();
		
		Che a1 = new Che();
		a1.color = "��ɫ";
		a1.speed = 80;
		a1.canRun();
		if (args[0].equals("�շ�վ"))
			a1.canStop();
		else
			a1.canRun();
	}
}