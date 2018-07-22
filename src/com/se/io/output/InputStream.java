package com.se.io.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStream {
	public static void main(String[] args) throws IOException {
		
		File f = new File("data/b.txt");
		//f.createNewFile();
		FileOutputStream fos = new FileOutputStream(f);
		fos.write("dsafasdgfagsageqrygwywtrhtrh".getBytes());
		System.out.println("–¥»Î≥…π¶");
	
	FileInputStream fis = new FileInputStream("data/b.txt");
	int length;
	byte[] bytes = new byte[1024];
	while((length=fis.read(bytes))!=-1) {
		System.out.println(new String(bytes,0,length));
	}
}
}
