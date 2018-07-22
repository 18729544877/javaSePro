package com.se.object;

public class StudentScore {
	private String name;
private int yuwenScore;
private int shuxueScore;
private int englishScore;
public StudentScore(String name, int yuwenScore, int shuxueScore, int englishScore) {
	super();
	this.name = name;
	this.yuwenScore = yuwenScore;
	this.shuxueScore = shuxueScore;
	this.englishScore = englishScore;
}
@Override
public String toString() {
	return "StudentScore [name=" + name + ", yuwenScore=" + yuwenScore + ", shuxueScore=" + shuxueScore
			+ ", englishScore=" + englishScore + "]";
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
public int getShuxueScore() {
	return shuxueScore;
}
public void setShuxueScore(int shuxueScore) {
	this.shuxueScore = shuxueScore;
}
public int getEnglishScore() {
	return englishScore;
}
public void setEnglishScore(int englishScore) {
	this.englishScore = englishScore;
}


}
