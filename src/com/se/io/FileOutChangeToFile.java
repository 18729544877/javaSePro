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
		while((ss=br.read(chars)) != -1) {//ȡ���ַ���������ѵ�������ĩβ���򷵻� -1 

			sb.append(chars,0,ss);//����������������ݶ������ŵ�stringbuffer����
		}
		System.out.println(sb.toString());
		char[] charss=sb.toString().toCharArray();
		Arrays.sort(charss);
		System.out.println(Arrays.toString(charss));
		
		File f1 = new File("data/c.txt");
		f1.createNewFile();
		//�����������ݷŵ��µ��ļ����桢
		BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
		bw.write(charss);//д��
		System.out.println("д�����");
		bw.close();
		br.close();
	}

}
