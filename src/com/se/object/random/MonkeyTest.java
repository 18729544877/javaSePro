package com.se.object.random;

public class MonkeyTest {
public static void main(String[] args) {
	System.out.println("����ժ�����⣺");
	int count=0;
	int yu=1;
	while(count<9){
		yu=(yu+1)*2;
		count++;
	}
	System.out.println(yu);
	//System.out.println(2*(yu+1));
	
	System.out.println("�ַ�������");
	String[] ssss= {"12","23","34"};
	for(int i=0;i<ssss.length;i++) {
		if(i==ssss.length-1){
			System.out.println(ssss[i]);//����ĩβ�Ŀ��ֽ�
		}else {
		System.out.print(ssss[i]+" ");
		}
	}
}
}
