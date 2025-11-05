package com.tnsif.exceptionexamples;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]={23,45,11};
		int c;
		try {
			
		  c=x[4];
			
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			c=x[2];
			System.out.println("C="+c);	
		}
		System.out.println("nextline");

	}

}
