package com.se.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
public static void main(String[] args) throws Exception {
	File f =new File("data/a.txt");
	//f.createNewFile();
	/*
	 * �ַ������
	 */
	OutputStream os = new FileOutputStream(f);
	OutputStreamWriter osw =  new OutputStreamWriter(os);
	osw.write("�����");
	
	
	String s="�����";
	osw.write(s, 0, s.length()-1);//������������һ����
	osw.write(101);//����������
	osw.write(49);
	osw.write("dsadadaf".toCharArray());
	char[] cbuf1="dsadadaf".toCharArray();
	osw.write(cbuf1, 0, cbuf1.length);
	
	osw.close();
	/*
	 * �ַ�������
	 */
	InputStream is = new FileInputStream(f);
	InputStreamReader isr = new InputStreamReader(is);
	char[] cbuf= new char[1024];
	int length;
	while((length=isr.read(cbuf))!=-1) {
		System.out.println(new String(cbuf,0,length));
	}
	System.out.println("�������");
	isr.close();
	
	
}
}
