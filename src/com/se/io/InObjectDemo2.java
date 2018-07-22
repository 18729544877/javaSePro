
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
			System.out.println("�������");//����ȡ���������ʱ���׳��쳣���ǿ��Խ��ܵ��쳣
		} finally {
			ois.close();//�ر���
			System.out.println(al);//�ȷŵ�������棬Ȼ�����
		}
		
	}

}
