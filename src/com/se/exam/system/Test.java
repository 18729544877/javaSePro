package com.se.exam.system;

public class Test {
	public static void main(String[] args) throws Throwable {
		SystemDemo s = new SystemDemo("С��");
		s=null;
		System.gc();
	}
}
