package com.tnsif.costructorassingment;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Customer c1=new Customer();
        c1.setSid(101);
        c1.setSname("ezhil");
        c1.setScity("panruti");
        System.out.println(c1);
        Customer c2 = new Customer();
        System.out.println(c2);
        Customer c3=new Customer(1,"priya","cuddalore");//invoke parameterized constructor
        System.out.println(c3);
	}

}
