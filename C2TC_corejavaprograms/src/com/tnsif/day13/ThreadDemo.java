package com.tnsif.day13;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread threadOne = new ChildThread(5, "First");
		ChildThread threadTwo = new ChildThread(10, "Second");

		threadOne.start(); 
		threadTwo.start();

		System.out.println("-----------End of Main-----------");
	

	}

}
