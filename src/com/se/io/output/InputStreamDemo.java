package com.se.io.output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("data/a.txt");
		// while(true) {
		// int s = fis.read();
		// if(s==-1) {
		// break;
		// }else {
		// System.out.print((char)s);
		// }
		// }
		byte[] b = new byte[1024];// 缓冲区
		int length = -1;
		// while((length=fis.read(b))!=-1) {// 读入缓冲区的总字节数
		// System.out.print(new String(b, 0, length));
		// }
		while (true) {
			int ff = -1;
			if ((ff = fis.read(b)) != -1) {
				System.out.println(new String(b, 0, ff));
			} else {
				break;
			}
		}
	}
}
