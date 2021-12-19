package com.pack.demo;

import com.pack.day6.overriding.ChildtClassB;
import com.pack.day6.overriding.ParenntClassA;

public class MethodOverRidingDemo {
	
	
	public static void main(String[] args) {
		
		
//		ChildtClassB obj = new ChildtClassB();
//		
//		obj.commonMethod();
//		
//		obj.method1();
//		
//		obj.method3();
		
		ParenntClassA obj = new ChildtClassB();
		
		obj.commonMethod();
		
		obj.method1();
		
		((ChildtClassB)obj).method3();
		
		
		obj.covariantReturnType();
		
		
		ParenntClassA objParent = new ParenntClassA();
		
		objParent.commonMethod();
		objParent.covariantReturnType();
		
		
		
		
	}

}
