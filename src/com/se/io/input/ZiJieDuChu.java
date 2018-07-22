package com.se.io.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ZiJieDuChu {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fs = new FileInputStream("data/c.txt");
		//按照字节数组读出
		int length=-1;
		byte[] bytes = new byte[1024];
		while((length=fs.read(bytes))!=-1){
			System.out.println(new String(bytes,0,length));
		}
	}   
}
