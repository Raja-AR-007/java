package com.Concepts.Collection_Concept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _60_Collection_List {
	public static void main(String args[]) {
//                                          Collection List

// List is used for Index Number or position of Collection.
// All the values like 'Integer, Double, String, Character' values are 'Object'.
		/*
		List values=new ArrayList();  // open Declaration of 'List'
		values.add(3);
		values.add(2);
		values.add(5);
		values.add(2,6);  // ('2' is Index Number, '6' is value or Object element) changing the Index Number of value 5
		
		Iterator it=values.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		/*
		output:
		3
		2
		6  // ('2' is Index Number, '6' is value or Object element)
		5
		 */
		
//                                          'for Loop' Collection
		/*
		List values=new ArrayList();  // open Declaration of 'List'
		values.add(3);
		values.add(2);
		values.add(5);
		values.add(2,6);  // ('2' is Index Number, '6' is value or Object element) changing the Index Number value 5
		
		for(int i=0; i<values.size(); i++) {
			
			System.out.println(values.get(i));
		}*/
		
		/*
		output:
		3
		2
		6  // ('2' is Index Number, '6' is value or Object element)
		5
		 */
		
//                                      'Enhanced for Loop' Collection
		
// All the values like 'Integer, Double, String, Character' values are 'Object elements'.
		
		List values=new ArrayList();  // open Declaration of 'List'
		values.add(3);  // Integer v=new Integer(3);
		values.add(2);
		values.add(5);
		values.add(2,6);  // ('2' is Index Number, '6' is value or Object element) changing the Index Number of value 5
		values.add("4");
		
		for(Object o: values) {  // Enhanced for Loop
			
			System.out.println(o);
		}
		
		/*
		output:
		3
		2
		6
		5
		4  // string
		 */
	}
}
