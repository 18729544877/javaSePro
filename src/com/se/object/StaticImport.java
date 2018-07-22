package com.se.object;
//import  java.lang.Maths.add;//lang不用倒

public class StaticImport {
public static void main(String[] args) {
	int a=3;
	int b=4;
	System.out.println("两个数字相加的和是："+StaticUtils.add(a,b));//自己写的与类库的方法名称相同（有冲突是）带上类名.方法名来区别
}


}
