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
//	fos.write("hello\r\nworld".getBytes());//换行必须是\r\n顺序不要反了
//	//fos.write("helloworld".getBytes(),5,5);
//	fos.write(97);//写入字符a
//	fos.write('a');
//	fos.close();//关闭
//	System.out.println("写入成功");
//	System.out.println("hello");
	
	FileOutputStream fos1 = new FileOutputStream("data/a.txt",true);//默认是false不能连续写入true才可以连续写入
	fos1.write("gsdsdsaf".getBytes());
	
}
}
