package com.se.Interface;

/**
 * 第一个数字与倒数第一个 数字相同，以此类推。。，
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
				//一次表示出每一位上面对应的 数字是几
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
		System.out.println("共有"+count);
}
}
