package com.pack.day6.interfaceDemo;

public interface Shape {
	
	public static final int x=100;			// public static final
	
	public abstract void setVal(int val);
	
	public abstract int getVal();
	
	public default void testdefaultmethod(){
		System.out.println("inside default method of interface");
	}
	
	public static void methodStaticDemo(){
		System.out.println("inside static method of interface");
	}
		
//	1 - abstract method
//	2 - static method
//	3 - default method
	
//	Shape(){
//		System.out.println("inside interface constructor");
//	}
	
	
	public static void main(String[] args) {
		
//		System.out.println("inside itnerface main method");
//		System.out.println("Value of x "+x);
//		System.out.println("Value of x "+Shape.x);
//		x=20;
//		Shape obj = new Shape();
		
		
		Shape.methodStaticDemo();
		System.out.println("Value of x "+Shape.x);
		methodStaticDemo();
			
	}
	

}



