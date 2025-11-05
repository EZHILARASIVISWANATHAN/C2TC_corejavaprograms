package com.tnsif.entityassignment;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
        s1.setId(21);
        s1.setCname("ezhil");
        s1.setMark(98);
        System.out.println(s1);//printing the object
       
        Student s2=new Student();
        s2.setId(41);
        s2.setCname("kaviya");
        s2.setMark(99);
        System.out.println(s2);
        
        Student s3=new Student();
        s3.setId(36);
        s3.setCname("jayavanam");
        s3.setMark(100);
        System.out.println(s3);
	}

}
