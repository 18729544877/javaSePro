package com.se.object.exception;

public class MyexceptionTest {

	public static void main(String[] args) {

		// new method:
		int result = way();
		
		System.out.println(result);

	}

	private static int way() {
		int a = 4;
		int b = 0;
		if (b == 0) {
			try {
				throw new MyexceptionDemo();
			} catch (MyexceptionDemo e) {
				System.out.println("自定义异常！！！");
				e.printStackTrace();
			}
		} else {
			return a / b;
		}
		return a;

	}
}
