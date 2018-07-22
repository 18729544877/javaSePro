package com.se.object;
/**
 * 猴子吃桃
 * 每天吃掉前一天剩下的一半多一，最后一天只剩一个（10天）
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