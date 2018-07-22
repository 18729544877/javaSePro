package com.se.object.set.test;

public class Student {
private String name;
private int  yuwenScore;
private int mathScore;
private int englishScore;
public Student(String name, int yuwenScore, int mathScore, int englishScore) {
	super();
	this.name = name;
	this.yuwenScore = yuwenScore;
	this.mathScore = mathScore;
	this.englishScore = englishScore;
}
@Override
public String toString() {
	return "Student [name=" + name + ", yuwenScore=" + yuwenScore + ", mathScore=" + mathScore + ", englishScore="
			+ englishScore + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getYuwenScore() {
	return yuwenScore;
}
public void setYuwenScore(int yuwenScore) {
	this.yuwenScore = yuwenScore;
}
public int getMathScore() {
	return mathScore;
}
public void setMathScore(int mathScore) {
	this.mathScore = mathScore;
}
public int getEnglishScore() {
	return englishScore;
}
public void setEnglishScore(int englishScore) {
	this.englishScore = englishScore;
}


}
