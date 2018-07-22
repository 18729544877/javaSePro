package com.se.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutObjectDemo2 {
	public static void main(String[] args) throws Exception, IOException {
		
		File f = new File("data/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(new Student("张三1",34));
			oos.writeObject(new Student("张三2",33));
			oos.writeObject(new Student("张三3",32));
			System.out.println("写入完成");
		oos.close();
//		BufferedWriter bw = new BufferedWriter(new FileWriter("data/a.txt"));
//		bw.newLine();//换行的作用
//		bw.write("sdsafafa");
//		bw.close();
		
		
		
	}
}
