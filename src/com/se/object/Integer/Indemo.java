package com.se.object.Integer;
/**
 * ���������Զ������װ�����ϰ
 * ע�����intValue��parseInt������
 * 
 * @author Administrator
 *
 */
public class Indemo {
	public static void main(String[] args) {
		Integer i1 = new Integer(12);
		Integer i2 = new Integer("12");
		/**
		 * ��integerתΪint��� �˴���intValue�������Ǿ�̬��������������ֱ�ӵ���
		 */
		System.out.println(i2.intValue());
		System.out.println(i2);


		Integer i3 = 12;// �Զ�װ��
		int i4 = i1;// �Զ�����
		System.out.println(i3);
		System.out.println(i4);

		int i5 = 4;
		i5 += 4;// �Զ�װ��
		System.out.println(i5);

		Integer i6 = 16;// װ��
		i6 += 4;// �Ȳ�����װ��
		System.out.println(i6);

		System.out.println(Integer.parseInt("123", 8));// ��8���Ƶ�123ת��Ϊʮ����
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.toBinaryString(i6));
		System.out.println(Integer.toHexString(45));
		System.out.println(Integer.highestOneBit(12));
		double d1 = i6.doubleValue();// �����������static���͵ģ����Բ�����Integerֱ�ӵ���
		System.out.println(d1);//��ӡ��d1��ֵ

		//System.out.println(Integer.compare(23, 24));//ǰ�������������
	}

}
