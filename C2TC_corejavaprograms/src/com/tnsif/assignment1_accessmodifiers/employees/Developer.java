package com.tnsif.assignment1_accessmodifiers.employees;

public class Developer extends Employee{
    private String ProgrammingLanguage;

	public Developer(String sname, int employeeid, double salary, String programmingLanguage) {
		super(sname, employeeid, salary);
		ProgrammingLanguage = programmingLanguage;
	}

	public String getProgrammingLanguage() {
		return ProgrammingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		ProgrammingLanguage = programmingLanguage;
	}

	@Override
	public String toString() {
		return "Developer [ProgrammingLanguage=" + ProgrammingLanguage + "sname:"+super.getSname()+"employeeid:"+super.getEmployeeid()+"salary:"+super.getSalary()+"]";
	}
    
}
