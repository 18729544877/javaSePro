package com.se.object.Integer;

/**
 * �ж��ַ�
 * ���ַ����д�Сд��ת��
 * @author Administrator
 *
 */
public class CharDemo {
public static void main(String[] args) {
	Character c = new Character('a');
	System.out.println(c.toString());//�D���ַ���
	System.out.println(Character.isDigit('e'));
	System.out.println(Character.isLowerCase(97));//�Ƿ���С����ĸ
	System.out.println(Character.isUpperCase(64));//�Д��Ƿ��Ǵ�
    System.out.println(Character.isDigit(53));//�Ƿ�������true
    System.out.println(Character.isDigit(58));//�Ƿ�������false
    //48--57�ֱ���0--9�Ķ�ӦascII��ֵ��
    //65-96�ֱ���A--Z
    //97--128�ֱ���a-z
    System.out.println(Character.toLowerCase(66));//B-->b���Ƕ�Ӧ��ascII��
    System.out.println(Character.toUpperCase(97));//a-->A��Ӧ����65

    System.out.println(Character.toLowerCase('A'));//����д����ĸת��ΪСд����ĸ
    System.out.println("HelloolleH");
    System.out.println("%%%000000%%%");
}
}
