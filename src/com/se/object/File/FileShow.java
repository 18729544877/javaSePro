package com.se.object.File;

import java.io.File;

public class FileShow {
public static void main(String[] args) {
	File f = new File("D:/workplace");
	show(f,".class");
}
//Ĭ��f��Ŀ¼��
private static void show(File f, String str) {//str������׺
	File[] fs = f.listFiles();
	for(File ff: fs) {
		if(ff.isDirectory()) {
			show(ff,str);
		}else {
			int i=0;
			i=ff.getAbsolutePath().indexOf(str);
			if(i!=-1&&i==ff.getAbsolutePath().length()-str.length()) {
				System.out.println(ff.getAbsolutePath());
			}
		}
	}
	
}
}
