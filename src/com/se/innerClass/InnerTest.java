package com.se.innerClass;

/**
 * @author Administrator
 *��ݼ�alt+shift+j
 */

/**
 * @author Administrator
 *
 */
public class InnerTest {
	public static void main(String[] args){
		Outer o = new Outer();
		o.method();
		Outer3  o2 = new Outer3();
//		o2.way();
//		o2.getInner2().way();
		Outer4  o4 = new Outer4();
		o4.useInner3();
		Outer5 o5 = new Outer5();
		o5.method2();
		o5.way5();
	}
}
class Outer5{
	public void method2() {
		class Inner5{
			public void way5() {
				System.out.println("�����ڲ���5��way5����");
			}
		}
		Inner5 i5 = new Inner5();
		i5.way5();
		
	}
	public void way5() {
		System.out.println("�����ⲿ��5��way5����");
	}
}
class Outer4{
	public void useInner3() {
		Inner3 i3= new Inner3();
		i3.way();
	}
	private class Inner3{
		public void way() {
			System.out.println("�ڲ���3��way����");
		}
	}
}
class Outer3{
	public void way() {
		System.out.println("�ⲿ���way����");
	}
	public Inner2 getInner2() {
		return new Inner2();
	}
	public class Inner2{
		public void way() {
			System.out.println("�����ڲ��۵Ķ�way����");
		}
	}
}
class Outer{
	public void method(){//�ڲ����ڳ�Ա��������
		class Inner{
			public void show(){
				System.out.println("�ڲ���� show����");
			}
		}
		Inner i = new Inner();
		i.show();
	}
	
}