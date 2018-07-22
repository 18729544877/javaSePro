package com.se.io.copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class VideoFuZhi {
		public static void main(String[] args) throws IOException {

			BufferedInputStream fis1 = new BufferedInputStream(new FileInputStream(new File("data/video/maven.avi")));
			BufferedOutputStream fos1 = new BufferedOutputStream(new FileOutputStream(new File("data/video/maven_copy.avi")));
		   int length;
		   byte[] bytes = new byte[1024];
			while((length=fis1.read(bytes))!=-1) {
				fos1.write(bytes, 0, length);
			}
			System.out.println("复制完成了");
			fis1.close();
			fos1.close();
		}
		}
