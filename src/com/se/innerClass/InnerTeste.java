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
		System.out.println("外部类的show方法");
	}
     private class Inner{//内部类类是私有的只有通过外部类的方法里面进行new获得
		public void show(){
			System.out.println("内部类的show方法");
		}
	}
}