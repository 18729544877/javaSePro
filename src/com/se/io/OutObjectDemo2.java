package com.se.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutObjectDemo2 {
	public static void main(String[] args) throws Exception, IOException {
		
		File f = new File("data/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(new Student("����1",34));
			oos.writeObject(new Student("����2",33));
			oos.writeObject(new Student("����3",32));
			System.out.println("д�����");
		oos.close();
//		BufferedWriter bw = new BufferedWriter(new FileWriter("data/a.txt"));
//		bw.newLine();//���е�����
//		bw.write("sdsafafa");
//		bw.close();
		
		
		
	}
}
