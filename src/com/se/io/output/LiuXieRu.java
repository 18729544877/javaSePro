package com.se.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class LiuXieRu {
	public static void main(String[] args) throws IOException {
		/*
		 * 这还是写入 的过程，有三种参数
		 */
		File f = new File("data/c.txt");
		// f.createNewFile();
		FileOutputStream os = new FileOutputStream(f);
		// os.write("sds".getBytes());
		// 参数是字节数组
		os.write("我是中国人！\r\n我爱中国".getBytes());
		// 参数是整数
		os.write('d');// d的ascii码是100
		os.write(100);
		// 参数是三个
		String s = "woshushuuuiwogenxingyunzijipiointatshui";
		byte[] b = s.getBytes();
		os.write(b, 0, s.length());
		/*
		 * 接下来是读出的过程：
		 */
	}
}