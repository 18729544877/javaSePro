package com.se.object.Integer;
/**
 * 对整数的自动拆箱和装箱的练习
 * 注意的是intValue和parseInt的区别
 * 
 * @author Administrator
 *
 */
public class Indemo {
	public static void main(String[] args) {
		Integer i1 = new Integer(12);
		Integer i2 = new Integer("12");
		/**
		 * 将integer转为int输出 此处的intValue方法不是静态方法不能拿类名直接调用
		 */
		System.out.println(i2.intValue());
		System.out.println(i2);


		Integer i3 = 12;// 自动装箱
		int i4 = i1;// 自动拆箱
		System.out.println(i3);
		System.out.println(i4);

		int i5 = 4;
		i5 += 4;// 自动装箱
		System.out.println(i5);

		Integer i6 = 16;// 装箱
		i6 += 4;// 先拆箱再装箱
		System.out.println(i6);

		System.out.println(Integer.parseInt("123", 8));// 将8进制的123转化为十进制
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.toBinaryString(i6));
		System.out.println(Integer.toHexString(45));
		System.out.println(Integer.highestOneBit(12));
		double d1 = i6.doubleValue();// 这个方法不是static类型的，所以不能用Integer直接调用
		System.out.println(d1);//打印出d1的值

		//System.out.println(Integer.compare(23, 24));//前后两个数子相减
	}

}
