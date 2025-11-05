package com.tnsif.assignment1_accessmodifiers;
import com.tnsif.assignment1_accessmodifiers.employees.*;
import com.tnsif.assignment1_accessmodifiersutilities.*;
public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp;
        emp=new Manager("ezhil",101,10000,"HR");
        if(emp instanceof Manager)
        	System.out.println("Manager details"+emp);
        emp=new Developer("priya",102,9000,"java");
        if(emp instanceof Developer)
        	System.out.println("Developer deatails"+emp);
       
	}

}
