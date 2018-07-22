package com.se.object.random;

public class MonkeyTest {
public static void main(String[] args) {
	System.out.println("猴子摘桃问题：");
	int count=0;
	int yu=1;
	while(count<9){
		yu=(yu+1)*2;
		count++;
	}
	System.out.println(yu);
	//System.out.println(2*(yu+1));
	
	System.out.println("字符串数组");
	String[] ssss= {"12","23","34"};
	for(int i=0;i<ssss.length;i++) {
		if(i==ssss.length-1){
			System.out.println(ssss[i]);//消除末尾的空字节
		}else {
		System.out.print(ssss[i]+" ");
		}
	}
}
}
