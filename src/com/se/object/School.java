package com.se.object;

public class School implements Cloneable{
private User user;
private String classs;
public School(User user, String classs) {
	super();
	this.user = user;
	this.classs = classs;
}
@Override
public String toString() {
	return "School [user=" + user + ", classs=" + classs + "]";
}
@Override
protected School clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return (School) super.clone();
}

}
