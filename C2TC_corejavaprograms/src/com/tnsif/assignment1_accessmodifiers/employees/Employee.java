package com.tnsif.assignment1_accessmodifiers.employees;

public class Employee {
      private String sname;
      private int employeeid;
      private double salary;
      
	  public Employee(String sname, int employeeid, double salary) {
	
		this.sname = sname;
		this.employeeid = employeeid;
		this.salary = salary;
	}
	  public String getSname() {
		  return sname;
	  }
	  public void setSname(String sname) {
		  this.sname = sname;
	  }
	  public int getEmployeeid() {
		  return employeeid;
	  }
	  public void setEmployeeid(int employeeid) {
		  this.employeeid = employeeid;
	  }
	  public double getSalary() {
		  return salary;
	  }
	  public void setSalary(double salary) {
		  this.salary = salary;
	  }
	  @Override
	  public String toString() {
		return "Employee [sname=" + sname + ", employeeid=" + employeeid + ", salary=" + salary + "]";
	  }
      
}
