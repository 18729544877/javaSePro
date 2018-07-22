package com.se.exam;

/*13.	通过随机数种子，输出两组相同的随机数。*/
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random r1 = new Random(1000);
		System.out.println(r1.nextLong());
		Random r2 = new Random();
		r2.setSeed(1000);
		System.out.println(r2.nextLong());
		
		Random r3= new Random(100000);
		Random r4= new Random(100000);
		System.out.println(r3.nextDouble());
		System.out.println(r4.nextDouble());
	}
}
