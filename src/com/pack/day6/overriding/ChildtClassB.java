package com.pack.day6.overriding;

public class ChildtClassB extends ParenntClassA{

	public void method3() {
		System.out.println("method3 form ChildtClassB");
	}

	// for over riding demo
	public void commonMethod() {
		System.out.println("commonMethod form ChildtClassB");
	}
	
	
	public ChildtClassB covariantReturnType() {
		System.out.println("covariantReturnType form ChildtClassB");
		return new ChildtClassB();
	}
	

}
