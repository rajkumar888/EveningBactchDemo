package com.pack.day6.methodOverloading;

public class MethodOverLoadingDemo {
	
	public void show(int x){
		System.out.println(" Value of integer x "+x);
	}
	
	private char show(char x){
		System.out.println(" Value of char ch "+x);
		return x;
	}
	
	 void show(boolean x){
		System.out.println(" Value of boolean val "+x);
	}
	
	protected void show(float x){
		System.out.println(" Value of float f1 "+x);
	}
	
	public void show(String x){
		System.out.println(" Value of String name "+x);
	}
	
	public void show(double x){
		System.out.println(" Value of double d1 "+x);
	}
	
	public void show(MethodOverLoadingDemo x){
		System.out.println(" Value of MethodOverLoadingDemo obj "+x);
	}
	
	
	public static void main(String[] args) {
		
		MethodOverLoadingDemo obj = new MethodOverLoadingDemo();
		
		obj.show(15.6f);
		
		obj.show(100);
		
		obj.show(obj);
		
		obj.show("Hello");
		
		obj.show('A');
	}
	
}
