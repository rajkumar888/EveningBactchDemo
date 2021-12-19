package com.pack.day6.interfaceDemo;

public class Rectangle implements Shape{

	int test=0;
	
	
	@Override
	public void setVal(int speed) {
		// TODO Auto-generated method stub
		test=speed;
		System.out.println("Value is set in Rectangle calss");
	}

	@Override
	public int getVal() {
		// TODO Auto-generated method stub
		System.out.println("returning the value in  Rectangle calss");
		return test;
	}

}
