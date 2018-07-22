package com.se.io.output;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
public static void main(String[] args) throws IOException {
	File f = new File("D:/Youku Files/download/历史转折中的邓小平 01_标清.flv");
	File f1 = new File("C:/Users/Administrator/Desktop/第一次/xiao.flv");
	BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f1));
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
	byte[] bytes = new byte[1024];
	int length;
	while((length=bis.read(bytes))!=-1) {
		bos.write(bytes, 0, length);
	}
	bos.close();
	bis.close();
	System.out.println("复制结束");
}
}
