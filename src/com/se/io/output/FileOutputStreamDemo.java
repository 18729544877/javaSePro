 package com.se.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamDemo {
public static void main(String[] args) throws IOException {
//	File f = new File("data/a.txt");
//	//f.createNewFile();
//	//System.out.println(f.getAbsolutePath());
//	FileOutputStream fos = new FileOutputStream(f);
//	fos.write("hello\r\nworld".getBytes());//���б�����\r\n˳��Ҫ����
//	//fos.write("helloworld".getBytes(),5,5);
//	fos.write(97);//д���ַ�a
//	fos.write('a');
//	fos.close();//�ر�
//	System.out.println("д��ɹ�");
//	System.out.println("hello");
	
	FileOutputStream fos1 = new FileOutputStream("data/a.txt",true);//Ĭ����false��������д��true�ſ�������д��
	fos1.write("gsdsdsaf".getBytes());
	
}
}
