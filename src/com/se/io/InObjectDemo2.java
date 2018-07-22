
package com.se.io;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class InObjectDemo2 {
	public static void main(String[] args) throws IOException, IOException, Exception {
		ArrayList al = new ArrayList();
		File f = new File("data/d.txt");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		try {
		while(true) {
			al.add(ois.readObject());
		}
		} catch (EOFException e) {
			System.out.println("读出完成");//当读取对象结束的时候抛出异常这是可以接受的异常
		} finally {
			ois.close();//关闭流
			System.out.println(al);//先放到结合里面，然后遍历
		}
		
	}

}
