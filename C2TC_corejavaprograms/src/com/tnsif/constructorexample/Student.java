package com.tnsif.constructorexample;

public class Student {
    private  int sid;
    private String sname;
    // default constructor
    public Student()
    {
    	this.sid=100;
    	this.sname="Ifet student";
    }
    // parameterized constructor
    public Student(int sid,String sname)
    {
    	this.sid=sid;
    	this.sname=sname;	
    }
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
