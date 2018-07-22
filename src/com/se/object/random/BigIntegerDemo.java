package com.se.object.random;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerDemo {

	public static void main(String[] args) {
	//	BigInteger bi = new BigInteger("111111111111");
		BigInteger bi1 = new BigInteger("111111111111");
		BigInteger bi2 = new BigInteger("111111111111");
		System.out.println(bi1.add(bi2));
		System.out.println(bi1.subtract(bi2));
		System.out.println(bi1.multiply(bi2));
		System.out.println(bi1.divide(bi2));
		
		BigDecimal bd1 = new BigDecimal("423.424");//参数需要字符串
		BigDecimal bd2 = new BigDecimal("423.424");
		System.out.println(bd1.add(bd2));
		System.out.println(bd1.subtract(bd2));
		System.out.println(bd1.multiply(bd2));
		System.out.println(bd1.divide(bd2));

	   BigDecimal bd = new BigDecimal(123.1);
	   BigDecimal bdd=new BigDecimal(123.1);
		System.out.println(bd.add(bdd));
		System.out.println(bd.subtract(bdd));
		BigDecimal s = bd.multiply(bdd);
		System.out.println(s.toString());
		System.out.println(bd.divide(bdd));
		
		//.之后有几位
		System.out.println(dianWeiShu(s.toString()));
	}

	private static int dianWeiShu(String string) {
	int  a = string.indexOf('.');
	int b = string.length()-1;
	System.out.println(b);
	return b-a;
		
	}

}
