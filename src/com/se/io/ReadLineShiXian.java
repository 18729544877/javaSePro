package com.se.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadLineShiXian {
	public static void main(String[] args) throws IOException {

		FileReader f = new FileReader("data/b.txt");
		int len;
		char[] cbuf = new char[1024];
		while((len=f.read(cbuf))!=-1) {
			System.out.println(new String(cbuf,0,len));
		}
		System.out.println("¶Á³ö½áÊø");
		f.close();
	}
}
