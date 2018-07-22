package com.se.io;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/*把ArrayList集合中的字符串数据存储到文本文件*/

public class ArrayListToText {
	public static void main(String[] args) throws IOException, Exception {
		File f = new File("data/f.txt");
		f.createNewFile();
		ObjectOutputStream fw = new ObjectOutputStream(new FileOutputStream(f));
		ArrayList<String> al = new ArrayList<String>();
		al.add("张三1");
		al.add("张三2");
		al.add("张三3");
		al.add("张三4");
		al.add("张三5");
		al.add("张三6");
		fw.writeObject(al);
		System.out.println("写入完成");
		fw.close();
		// 接下来是读出
		ArrayList<String> nal = new ArrayList<String>();
		System.out.println(new File("data/f.txt").exists());
		ObjectInputStream fw1 = new ObjectInputStream(new FileInputStream("data/f.txt"));
		try {
			while (true) {
				System.out.println(fw1.readObject());
			}
		} catch (EOFException e) {
			System.out.println("数据读完");
		} finally {
			fw1.close();
			System.out.println("关闭");
		}
	}
}
