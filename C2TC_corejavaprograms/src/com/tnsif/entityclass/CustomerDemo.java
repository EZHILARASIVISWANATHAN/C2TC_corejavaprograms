package com.tnsif.entityclass;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Customer c1=new Customer();
        c1.setId(101);
        c1.setCname("ezhil");
        c1.setCity("villupuram");
        System.out.println(c1);//printing the object
       
        Customer c2=new Customer();
        c2.setId(102);
        c2.setCname("priya");
        c2.setCity("puducherry");
        System.out.println(c2);
	}

}
