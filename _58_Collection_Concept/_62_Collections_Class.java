package com.Concepts.Collection_Concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _62_Collections_Class {

	public static void main(String[] args) {
		
//                                               Collections Class
		
// Collections is a Class used to do different Method(). for example sort(),reverse(),shuffle(),swap()
		
// sort() Method is used to sort the values in 'Ascending order' small to big.
		
		List values=new ArrayList();  // open Declaration of 'List'
		values.add(1);  // Integer v=new Integer(3);
		values.add(2);
		values.add(3);
		values.add(4);  
		
		
		Collections.sort(values);  // "Collections Class" (used to print the values in 'Ascending' order small to big)
		Collections.reverse(values);  // Collections Class (used to print the values in 'Descending' order big to small)
		Collections.swap(values,2,1);  // used to change values Index position
		Collections.shuffle(values);  // used to mix the values
		
		for(Object o: values) {  
			
			System.out.println(o);
		}
		/*
		output:
		1
		2
		3
		4
		 */

//                                           
		/*
		List values=new ArrayList();  // open Declaration of 'List'
		values.add(1);  // Integer v=new Integer(3);
		values.add(2);
		values.add(3);
		values.add(4);  
		
		Collections.reverse(values);  // Collections Class (used to print the values in 'Descending order big to small')
		
		for(Object o: values) {  
			
			System.out.println(o);
		}*/
		/*
		output:
		4
		3
		2
		1
		 */
	}
}
