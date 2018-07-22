package com.se.object;


public  class FanXing<T>{
	private T t;

	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	
	public FanXing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FanXing(T t) {
		super();
		this.t = t;
	}
	public  void show(T t) {
		System.out.println(t);
	}

}