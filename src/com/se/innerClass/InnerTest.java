package com.se.innerClass;

/**
 * @author Administrator
 *快捷键alt+shift+j
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
				System.out.println("这是内部类5的way5方法");
			}
		}
		Inner5 i5 = new Inner5();
		i5.way5();
		
	}
	public void way5() {
		System.out.println("这是外部类5的way5方法");
	}
}
class Outer4{
	public void useInner3() {
		Inner3 i3= new Inner3();
		i3.way();
	}
	private class Inner3{
		public void way() {
			System.out.println("内部类3的way方法");
		}
	}
}
class Outer3{
	public void way() {
		System.out.println("外部类的way方法");
	}
	public Inner2 getInner2() {
		return new Inner2();
	}
	public class Inner2{
		public void way() {
			System.out.println("这是内部累的额way方法");
		}
	}
}
class Outer{
	public void method(){//内部类在成员方法里面
		class Inner{
			public void show(){
				System.out.println("内部类的 show方法");
			}
		}
		Inner i = new Inner();
		i.show();
	}
	
}