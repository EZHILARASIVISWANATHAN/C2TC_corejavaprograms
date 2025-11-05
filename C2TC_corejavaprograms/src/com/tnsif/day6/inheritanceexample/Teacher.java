package com.tnsif.day6.inheritanceexample;

public class Teacher extends Person {
    private int id;
    private String designation;
    private String session;
    
	public Teacher(String name, int age, String city, int id, String designation, String session) {
		super(name, age, city);
		this.id = id;
		this.designation = designation;
		this.session = session;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", designation=" + designation + ", session=" + session + "Name:"+super.getName()+"Age:"+super.getAge()+"City:"+super.getCity()+"]";
	}
    
	
	
}
