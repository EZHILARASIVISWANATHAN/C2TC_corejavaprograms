package com.tnsif.costructorassingment;

public class Customer {
    private int sid;
    private String sname;
    private String scity;
    public Customer()
    {
    	this.sid=100;
    	this.sname="jaivan";
    	this.scity="villupuram";
    }
    // parameterized constructor
    public Customer(int sid,String sname,String scity)
    {
    	this.sid=sid;
    	this.sname=sname;
    	this.scity=scity;
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
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	@Override
	public String toString() {
		return "Customer [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}
}
