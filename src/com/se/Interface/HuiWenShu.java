package com.se.Interface;

/**
 * ��һ�������뵹����һ�� ������ͬ���Դ����ơ�����
 * @author Administrator
 *
 */
public class HuiWenShu {
	public static void main(String[] args){
		int g=0;
		int s=0;
		int b=0;
		int q=0;
		int w=0;
		int count=0;
		
		for(int i=1000;i<100000;i++){
			if(i<10000){
				//һ�α�ʾ��ÿһλ�����Ӧ�� �����Ǽ�
				g=i%10*1000;
				s=i/10%10*100;
				b=i/10/10%10*10;
				q=i/10/10/10%10*1;
				if(g+s+b+q==i){
					System.out.println(i);
					count++;
				}
			}else{
				g=i%10*10000;
				s=i/10%10*1000;
				b=i/10/10%10*100;
				q=i/10/10/10%10*10;
				w=i/10/10/10/10%10*1;
				if(g+s+b+q+w==i){
					System.out.println(i);
					count++;
			   }
		}
	}
		System.out.println("����"+count);
}
}
