package com.se.object;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		User u = new User("����",12);
		School s1 = new School(u,"һ��");
		System.out.println(u);    
		System.out.println(s1); 
		School s2=s1;
		System.out.println(s2); 
		School s3= s2.clone();
		//Object ��� equals ����ʵ�ֶ����ϲ�������������ȹ�ϵ��
		//���������κηǿ�����ֵ x �� y�����ҽ��� x �� y ����ͬһ������ʱ���˷����ŷ��� true
		System.out.println(s1.equals(s2));//ֻҪ�������
		System.out.println(s1.equals(s3));//false
		System.out.println(s3.equals(s2));//false
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		System.out.println(s3==s2);//false
		System.out.println(s3);
		System.out.println(s1.getClass().getName());//�������ȫ��
		System.out.println(s1.hashCode());//����Ĺ�ϣ��
	}

}
