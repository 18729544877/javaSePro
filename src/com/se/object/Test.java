package com.se.object;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		User u = new User("张三",12);
		School s1 = new School(u,"一班");
		System.out.println(u);    
		System.out.println(s1); 
		School s2=s1;
		System.out.println(s2); 
		School s3= s2.clone();
		//Object 类的 equals 方法实现对象上差别可能性最大的相等关系；
		//即，对于任何非空引用值 x 和 y，当且仅当 x 和 y 引用同一个对象时，此方法才返回 true
		System.out.println(s1.equals(s2));//只要这个是真
		System.out.println(s1.equals(s3));//false
		System.out.println(s3.equals(s2));//false
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		System.out.println(s3==s2);//false
		System.out.println(s3);
		System.out.println(s1.getClass().getName());//返回类的全称
		System.out.println(s1.hashCode());//对象的哈希吗
	}

}
