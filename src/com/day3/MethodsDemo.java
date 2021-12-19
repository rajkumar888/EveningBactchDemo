package com.day3;

public class MethodsDemo {
	
	int x=100;
	int y=999;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static void main(String[] args) {
		MethodsDemo obj = new MethodsDemo();
	
		System.out.println("value of x "+obj.getX());
//		System.out.println("value of x "+obj.x);
		System.out.println("...............");
		System.out.println("value of y "+obj.getY());
//		System.out.println("value of y "+obj.y);
		
//		obj.x=199;
//		obj.y=9898;
//		System.out.println("value of x "+obj.x);
//		System.out.println("value of y "+obj.y);
		System.out.println("...............");
		
		obj.setX(444);
		obj.setY(787);
		System.out.println("value of x "+obj.getX());
		System.out.println("value of y "+obj.getY());
		
	}

}
