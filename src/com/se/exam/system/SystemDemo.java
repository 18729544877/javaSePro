package com.se.exam.system;

/*14.	System.gc()�����������ã���ͨ����������*/
//�����������ʹ�����֮����ڴ�����ͷţ������������������ڴ�
public class SystemDemo {
	String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public SystemDemo(String str) {
		super();
		this.str = str;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(str+"�ѻ���");
	}
}
