package com.se.io;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/*��ArrayList�����е��ַ������ݴ洢���ı��ļ�*/

public class ArrayListToText {
	public static void main(String[] args) throws IOException, Exception {
		File f = new File("data/f.txt");
		f.createNewFile();
		ObjectOutputStream fw = new ObjectOutputStream(new FileOutputStream(f));
		ArrayList<String> al = new ArrayList<String>();
		al.add("����1");
		al.add("����2");
		al.add("����3");
		al.add("����4");
		al.add("����5");
		al.add("����6");
		fw.writeObject(al);
		System.out.println("д�����");
		fw.close();
		// �������Ƕ���
		ArrayList<String> nal = new ArrayList<String>();
		System.out.println(new File("data/f.txt").exists());
		ObjectInputStream fw1 = new ObjectInputStream(new FileInputStream("data/f.txt"));
		try {
			while (true) {
				System.out.println(fw1.readObject());
			}
		} catch (EOFException e) {
			System.out.println("���ݶ���");
		} finally {
			fw1.close();
			System.out.println("�ر�");
		}
	}
}
