package com.se.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class LiuXieRu {
	public static void main(String[] args) throws IOException {
		/*
		 * �⻹��д�� �Ĺ��̣������ֲ���
		 */
		File f = new File("data/c.txt");
		// f.createNewFile();
		FileOutputStream os = new FileOutputStream(f);
		// os.write("sds".getBytes());
		// �������ֽ�����
		os.write("�����й��ˣ�\r\n�Ұ��й�".getBytes());
		// ����������
		os.write('d');// d��ascii����100
		os.write(100);
		// ����������
		String s = "woshushuuuiwogenxingyunzijipiointatshui";
		byte[] b = s.getBytes();
		os.write(b, 0, s.length());
		/*
		 * �������Ƕ����Ĺ��̣�
		 */
	}
}