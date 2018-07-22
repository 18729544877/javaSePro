package com.se.io.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class FuZhiFile {
public static void main(String[] args) throws IOException {
	//File f = new File("D:/Youku Files/download/历史转折中的邓小平 01_标清.flv");
	//File f1 = new File("C:/Users/Administrator/Desktop/第一次/d.flv");
	//f1.createNewFile();
	File file3 = new  File("C:\\Users\\Administrator\\Desktop\\知识总结.txt");
	//FileInputStream fis = new FileInputStream(f);
	//FileOutputStream fos = new FileOutputStream(f1);
	FileInputStream fos3 = new FileInputStream(file3);
	byte[] b = new byte[1];
	int length;
	System.out.println("开始:"+new Date());
	while((length=fos3.read(b))!=-1) {
		for(int i=0;i<1000000;i++){
			if(Math.random()*10000==i){
				System.out.println(i);
				break;
			}
		}
		//fos.write(new String(b,0,length).getBytes());
		System.out.print(new String(b,0,length));
		//fos.write(b, 0, length);
	}
	System.out.println("输出成功：");
	System.out.println("结束："+new Date());
}
}
