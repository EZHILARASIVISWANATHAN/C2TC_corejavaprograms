package com.tnsif.day6.inheritanceexample;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s=new Student("ezhil",20,"panruti",101,"java");
        Teacher t=new Teacher("priya",23,"villupuram",103,"Professor","pm");
        Person p=new Person("jaya",21,"cuddalore");
        System.out.println(s);
        System.out.println(t);
        System.out.println(p);
	}

}
