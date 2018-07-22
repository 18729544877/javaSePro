package com.se.object;


	public class Circle {	
		int radius; 
		public Circle() { 
			radius=1; 
			} 
		public int getRadius() {
				return radius; 
			} 
		public void setRadius(int newRadius) {
				radius=newRadius;
				} 
	   public double circleArea() {
		return Math.PI*radius*radius; 
		}
	   public double circleLength() { 
		return 2.0*Math.PI*radius; 
		}
	public static void main(String[] args) {
		Circle circle =  new Circle();
		
		circle.setRadius(100);
		System.out.println("l:"+circle.circleLength());
		System.out.println("s:"+circle.circleArea());
	}   
	}
	
	
//	<%page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%> 
//	<html>
//	<head>
//	<meta http-equiv="Content-Type"content="text/html; charset=ISO-8859-1">
//	<title>
//	Insert title here</title></head><body>
//	<jsp:useBean id = "haha" class="first.Circle" scope="page"/>
//	<%haha.setRadius(100);%><P>Ô²µÄ°ë¾¶ÊÇ£º<%=haha.getRadius()%>
//	<P>Ô²µÄÖÜ³¤ÊÇ£º<%=haha.circleLength()%>
//	<P>Ô²µÄÃæ»ýÊÇ£º<%=haha.circleArea()%>
//	</body>
//	</html>

