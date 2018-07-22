package com.se.exam.system;

/*14.	System.gc()概述，其作用，并通过代码体现*/
//当对象的引用使用完毕之后对内存进行释放，就是清理垃圾回收内存
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
		System.out.println(str+"已回收");
	}
}
