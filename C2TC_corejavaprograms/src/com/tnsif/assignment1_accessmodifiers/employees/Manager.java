package com.tnsif.assignment1_accessmodifiers.employees;

public class Manager extends Employee{
    private String depatment;

	public Manager(String sname, int employeeid, double salary, String depatment) {
		super(sname, employeeid, salary);
		this.depatment = depatment;
	}

	public String getDepatment() {
		return depatment;
	}

	public void setDepatment(String depatment) {
		this.depatment = depatment;
	}

	@Override
	public String toString() {
		return "Manager [depatment=" + depatment + "sname:"+super.getSname()+"employeeid:"+super.getEmployeeid()+"salary:"+super.getSalary()+"]";
	}
    
}
