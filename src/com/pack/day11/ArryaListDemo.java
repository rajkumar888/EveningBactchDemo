package com.pack.day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArryaListDemo {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();

		list1.add("Fan");
		list1.add("Table");
		list1.add("Java");
		list1.add("Microsoft");
		list1.add("Apple");

//		System.out.println(list1);

		list1.forEach(value -> System.out.print(value+" ") );
		
		System.out.println(".......................");
		
		list1.forEach(System.out::println);  
		
		System.out.println(".......................");
//		list1.stream().forEach(value -> System.out.print(value+" ") );
//		list1.stream().forEachOrdered(value -> System.out.print(value+" ") );
		list1.stream().forEachOrdered(System.out::println);

		//
		// for (int i = 0; i < list1.size(); i++) {
		//
		// System.out.print(list1.get(i) + " ");
		// }
		//
		// System.out.println();
		//
		// for (int i = list1.size() - 1; i >= 0; i--) {
		//
		// System.out.print(list1.get(i) + " ");
		// }
		//
		// System.out.println();
		//
		// for (String ls : list1) {
		//
		// System.out.print(ls + " ");
		// }
		// System.out.println(".......................");
		//
		// Iterator<String> iter = list1.iterator();
		//
		// for (; iter.hasNext();) {
		// System.out.print(iter.next()+" ");
		// }
		//
		// System.out.println(".......................");
		//
		// ListIterator<String> listiter = list1.listIterator();

		//
		// for (; listiter.hasNext();) {
		// System.out.print(listiter.next()+" ");
		// }
		// System.out.println(".......................");
		//
		// for (; listiter.hasPrevious();) {
		// System.out.print(listiter.previous()+" ");
		// }
		// System.out.println(".......................");

		// ListIterator<String> listreverse = list1.listIterator(list1.size());
		//
		// for (; listreverse.hasPrevious();) {
		// System.out.print(listreverse.previous()+" ");
		// }

	}

}
