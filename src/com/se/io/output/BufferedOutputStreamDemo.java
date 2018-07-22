package com.se.io.output;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
public static void main(String[] args) throws IOException {
	File f = new File("D:/Youku Files/download/��ʷת���еĵ�Сƽ 01_����.flv");
	File f1 = new File("C:/Users/Administrator/Desktop/��һ��/xiao.flv");
	BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f1));
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
	byte[] bytes = new byte[1024];
	int length;
	while((length=bis.read(bytes))!=-1) {
		bos.write(bytes, 0, length);
	}
	bos.close();
	bis.close();
	System.out.println("���ƽ���");
}
}
