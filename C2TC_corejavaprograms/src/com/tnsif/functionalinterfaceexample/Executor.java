package com.tnsif.functionalinterfaceexample;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Calculate c1 = new Arithmetic();
        //c1.calculateTesting(55,22);
        Calculate c1=new Calculate()
        {
        	public void calculateTesting(int a,int b)
        	{
        		System.out.println("Addition:"+(a+b));
        	}
        };
        c1.calculateTesting(10,20);
        Calculate c2=new Calculate()
        {
        	public void calculateTesting(int a,int b)
        	{
        		System.out.println("Subtraction:"+(a-b));
        	}
        };
        c2.calculateTesting(8,10);
        }
        //lambda Expression
	    Calculate c3=(n,m)->{System.out.println("multiply:"+n*n);};
	    Calculate c4=(n,m)->{System.out.println("multiply:"+n/n);};
	    
}
