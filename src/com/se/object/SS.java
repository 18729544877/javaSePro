package com.se.object;

public class SS {
    public static void main(String[] args){
    	Object [] A = new Object[2];
    	A[0] = new Add(); 
    	A[1] = new Sub();
    	((Add) A[0]).getAnswer();
    	((Sub) A[1]).gerAnswer();
    }
}

class Add{
	public void getAnswer(){
		System.out.println("result is null");
	}
}

class Sub{
	
	public void gerAnswer(){
		System.out.println("结果是惊喜的");
	}
}



