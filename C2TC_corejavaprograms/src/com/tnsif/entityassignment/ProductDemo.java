package com.tnsif.entityassignment;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
        p1.setId(10);
        p1.setCname("Dress");
        p1.setCost(2500);
        System.out.println(p1);//printing the object
       
        Product p2=new Product();
        p2.setId(11);
        p2.setCname("Chocolate");
        p2.setCost(100);
        System.out.println(p2);
        
        Product p3=new Product();
        p3.setId(12);
        p3.setCname("Biscut");
        p3.setCost(20);
        System.out.println(p3);
	}

}
