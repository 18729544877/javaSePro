package com.se.object;
/**
 * ���ӳ���
 * ÿ��Ե�ǰһ��ʣ�µ�һ���һ�����һ��ֻʣһ����10�죩
 * @author Administrator
 *
 */
public class HouZi {
public static void main(String[] args) {
	//10 is day number
	int num=zhaiTao(1);
	System.out.println(num);
}
public static int zhaiTao(int day){

if(day==3) {
	return 1;
}else {
	day++;
	return (zhaiTao(day)+1)*2;
}
}
}