package com.se.object.File;

import java.io.File;
import java.io.FilenameFilter;
/*
 * 
 *����ָ��·������Ĵ���ָ����׺���ļ�����������·����
 */
public class FileDemo {
public static void main(String[] args) {
	File f = new File("C:/");
	File[] fs = f.listFiles(new FilenameFilter() {

		@Override
		public boolean accept(File dir, String name) {
			File f = new File(dir,name);
			String str=".txt";
			int i=f.getAbsolutePath().lastIndexOf(str);
			return f.getAbsolutePath().length()-str.length()==i&&i!=-1;
		}
		
	});
	for(File ff : fs) {
		System.out.println(ff.getAbsolutePath());
	}
}
}
