package com.se.object.exception;

public class ExceptionDemo {
public static void main(String[] args) {
	/*
	 * 运行时异常的例子
	 */
	int a=3;
	int b=0;
	int c=0;
	int[] d = {1,2,3};

//	try {
//		c=a/b;
//		d[3]=8;
//	}catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
//		System.out.println("为0异常或下标越界异常");
//	}//运行时异常的平级关系的异常的处理方式
//	
//	System.out.println(c);
//	System.out.println("over");
/*
 * 运行结果是：为0异常或下标越界异常
 *         o
 *         over
 */
/*
 * 异常的分类是编译时异常和运行时异常：编译时异常必须处理否则不能编译通过。
 * 运行时异常则可以不处理，error是严重异常，程序解决不了的异常，所以不需要处理。只有关闭程序。
 * 异常的平级关系可以将异常写在一块，中间加上竖线
 */
	try {
		c=a/b;
		d[3]=8;
	}catch(ArithmeticException e){
		System.out.println("为0异常");//c出现异常倒置下面的（的d[3]=8）也就不执行了所以只看到了为0异常
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("下标越界异常：");
	}
	
	System.out.println(c);
	System.out.println("over");
	
/*
 为0异常
0
over
*/
}
}
