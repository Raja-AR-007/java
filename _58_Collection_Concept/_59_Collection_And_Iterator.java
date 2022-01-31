//package com.Concepts.Collection_Concept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class _59_Collection_And_Iterator {
	public static void main(String args[]) {
		
//                                      Collection (1.2)
		
// we can use Collection instead of using Array.
// In Collection all the values are like 'Integer, Double, String, Character' are 'Object elements'.
		/*
		Collection values=new ArrayList();  // Collection 1.2
		values.add(3);
		values.add(2);
		values.add(5);
		
		System.out.println(values);
		*/
		
		/*
		output:
		[3, 2, 5]
		 */
		
//                                   Iterator on Collection

// Iterator is used to print or execute individual value. and it will execute one by one.
		/*
		Collection values=new ArrayList();  // Collection 1.2
		values.add(3);
		values.add(2);
		values.add(5);
		
		Iterator it= values.iterator();
		
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		*/
		
		/*
		output:
		3
		2
		5
		 */
		
		Collection values=new ArrayList();  // Collection 1.2
		values.add(3);
		values.add(2);
		values.add(5);
		
		Iterator it= values.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		/*
		output:
		3
		2
		5
		 */


	}
}
