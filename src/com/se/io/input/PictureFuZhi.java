package com.se.io.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PictureFuZhi {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream(new File("data/image/ul.gif"));
	FileOutputStream fos = new FileOutputStream(new File("data/image/copy_ul.gif"));
   int length=-1;
   byte[] bytes = new byte[1024];
	while((length=fis.read(bytes))!=-1) {
		fos.write(bytes, 0, length);
	}
	System.out.println("复制完成了");
}
}
