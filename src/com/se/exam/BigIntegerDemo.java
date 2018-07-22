package com.se.exam;

import java.math.BigInteger;

/*15.	使用BigInteger, BigDecimal实现大数字 + - * / */
public class BigIntegerDemo {
	public static void main(String[] args) {
		BigInteger bi1 = new BigInteger("111114242342342222228");
		BigInteger bi2 = new BigInteger("111111111333333333333");

		System.out.println(bi1.add(bi2));
		System.out.println(bi1.subtract(bi2));
		System.out.println(bi1.multiply(bi2));
		System.out.println(bi1.divide(bi2));
	}
}
