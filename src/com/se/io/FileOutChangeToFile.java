package com.se.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileOutChangeToFile {
	public static void main(String[] args) throws IOException {
		
		File f = new File("data/b.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		StringBuffer sb = new StringBuffer();
		char[] chars = new char[1024];
		int ss=-1;
		while((ss=br.read(chars)) != -1) {//取的字符数，如果已到达流的末尾，则返回 -1 

			sb.append(chars,0,ss);//将输入流里面的内容读出来放到stringbuffer里面
		}
		System.out.println(sb.toString());
		char[] charss=sb.toString().toCharArray();
		Arrays.sort(charss);
		System.out.println(Arrays.toString(charss));
		
		File f1 = new File("data/c.txt");
		f1.createNewFile();
		//将排序后的内容放到新的文件里面、
		BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
		bw.write(charss);//写入
		System.out.println("写入完成");
		bw.close();
		br.close();
	}

}
