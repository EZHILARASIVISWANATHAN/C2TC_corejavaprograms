package com.tnsif.day6.usingfinal;

public class FinalVariable {
    final int x=100;
    //final static int y;
    final static int z=10;
    void change() {
    	//x=30;
    	//y=200;
    }
	@Override
	public String toString() {
		return "FinalVariable [x=" + x + "]";
	}
    
}
