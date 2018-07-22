package com.se.io.copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InToOutCopy {
	public static void main(String[] args) throws IOException {

		File src = new File("D:/360Downloads");
		File mb = new File("C:/360Downloads");

		if (!(mb.isDirectory())) {// ���û��Ŀ¼�ʹ���Ŀ¼
			mb.mkdir();
		}
		fileCopy(src, mb);
	}

	private static void fileCopy(File src, File mb) throws IOException {
		File[] fs = src.listFiles();//˼·���õľ��ǻص�����
		for (File f : fs) {

			File newDir = new File(mb, f.getName());

			if (f.isFile()) {
				newDir.createNewFile();
				FileOutputStream os = null;
				FileInputStream is = null;
				os = new FileOutputStream(newDir);
				is = new FileInputStream(f);
				int length;
				byte[] bytes = new byte[1024];

				while ((length = is.read(bytes)) != -1) {
					os.write(bytes, 0, length);
					if (is != null) {
						is.close();
					}
					if (os != null) {
						os.close();
					}
				}
			}

			if (f.isDirectory()) {
				newDir.mkdir();
				fileCopy(f, newDir);
			}
		}
	}
}
