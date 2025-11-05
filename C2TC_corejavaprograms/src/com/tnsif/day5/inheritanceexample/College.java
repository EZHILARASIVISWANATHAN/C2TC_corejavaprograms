package com.tnsif.day5.inheritanceexample;

public class College {
    private String Collegename;
    private String Location;
    
	public College(String collegename, String location) {
		
		Collegename = collegename;
		Location = location;
	}
	public String getCollegename() {
		return Collegename;
	}
	public void setCollegename(String collegename) {
		Collegename = collegename;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "College [Collegename=" + Collegename + ", Location=" + Location + "]";
	}
}
