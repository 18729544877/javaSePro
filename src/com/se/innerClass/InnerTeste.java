package com.se.innerClass;

public class InnerTeste {
	public static void main(String[] args){
		
		
		Outer o = new Outer();
		
		o.getInner();
		
	}
}

class Outer{
	public void getInner(){
		Inner i = new Inner();
		i.show();
	}
	
	public void show(){
		System.out.println("�ⲿ���show����");
	}
     private class Inner{//�ڲ�������˽�е�ֻ��ͨ���ⲿ��ķ����������new���
		public void show(){
			System.out.println("�ڲ����show����");
		}
	}
}