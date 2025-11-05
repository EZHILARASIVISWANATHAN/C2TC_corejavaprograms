package com.tnsif.entityassignment;

public class Student {
	private int id;
    private String cname;
    private int mark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", cname=" + cname + ", mark=" + mark + "]";
	}
    
}
