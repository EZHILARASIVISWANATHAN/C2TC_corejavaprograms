package com.tnsif.bufferedreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class BufferDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String name= br.readLine();
		int age =Integer.parseInt(br.readLine());

	}

}
