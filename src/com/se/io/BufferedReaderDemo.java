package com.se.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class BufferedReaderDemo {
public static void main(String[] args) throws IOException {
	File f = new File("data/a.txt");
	BufferedReader br = new BufferedReader(new FileReader(f));
    FileReader fr= new FileReader("data/b.txt");
	String s=null;
	LineNumberReader lnr = new LineNumberReader(fr);
	
		for (int i = 0; i < 2; i++) {
			s = lnr.readLine();
			// System.out.println(s);
			System.out.println(lnr.getLineNumber() + "," + s);
		}
		System.out.println(lnr.getLineNumber() + "," + lnr.readLine());//相当于游标
//	lnr.setLineNumber(3);
//	while((s=lnr.readLine())!=null) {
//		System.out.println(lnr.getLineNumber()+","+s);
//	}
//	br.close();
	}
}

