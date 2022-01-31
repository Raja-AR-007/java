//package com.Concepts.Collection_Concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class _63_Comparator_Interface {

//                                                        if Condition
// Comparator is a Interface.
// By using Comparator we can sort the values from last Digit.
	/*
	public static void main(String[] args) {
		
		List<Integer> values=new ArrayList<>();  // open Declaration of 'List'
		values.add(109);  // Integer v=new Integer(3);
		values.add(254);
		values.add(378);
		values.add(453);  
		
		Comparator<Integer> c= new Comparator<Integer>() {  // Comparator
								public int compare(Integer i, Integer j) {
									if(i%10 > j%10)  // if Condition
										return 1;
									else;
										return -1;
								}
							};
		
		Collections.sort(values,c);  // "Collections Class" (used to print the values in 'Ascending order small to big')
		
		for(Integer o: values) {  
			System.out.println(o);
		}
	}*/
	
//                                             'Ternary Operator' is used instead of if Condition
	/*
	public static void main(String[] args) {
			
		List<Integer> values=new ArrayList<>();  // open Declaration of 'List'
		values.add(109);  // Integer v=new Integer(3);
		values.add(254);
		values.add(378);
		values.add(453);  
		
		Comparator<Integer> c= new Comparator<Integer>() {  // Comparator
								public int compare(Integer i, Integer j) {
									return i%10 > j%10 ? 1 : -1;  // Ternary Operator
								}
							};
		
		Collections.sort(values,c);  // "Collections Class" (used to print the values in 'Ascending order small to big')
		
		for(Integer o: values) {  
			System.out.println(o);
		}
	}*/

//                                                     Lambda Expression step-1
	/*
	public static void main(String[] args) {
		
		List<Integer> values=new ArrayList<>();  // open Declaration of 'List'
		values.add(109);  // Integer v=new Integer(3);
		values.add(254);
		values.add(378);
		values.add(453);  
		
		Comparator<Integer> c= (Integer i, Integer j) -> {  // Comparator
								return i%10 > j%10 ? 1 : -1;  // Ternary Operator
							}; 
		
		Collections.sort(values,c);  // "Collections Class" (used to print the values in 'Ascending order small to big')
		
		for(Integer o: values) {  
			System.out.println(o);
		}
	}*/
	
//                                                      Lambda Expression step-2
	/*
	public static void main(String[] args) {
		
		List<Integer> values=new ArrayList<>();  // open Declaration of 'List'
		values.add(109);  // Integer v=new Integer(3);
		values.add(254);
		values.add(378);
		values.add(453);  
		
		Comparator<Integer> c= (i, j) -> i%10 > j%10 ? 1 : -1;  // Comparator
		
		Collections.sort(values,c);  // "Collections Class" (used to print the values in 'Ascending order small to big')
		
		for(Integer o: values) {  
			System.out.println(o);
		}
	}*/
	
//                                                  Fetching Comparator's code in sort's Argument
	
// Comparator is a Interface.
// By using Comparator we can sort the values from last Digit.
	
	public static void main(String[] args) {
		
		List<Integer> values=new ArrayList<>();  // open Declaration of 'List'
		values.add(109);  // Integer v=new Integer(3);
		values.add(254);
		values.add(378);
		values.add(453);  
		
		Collections.sort(values,(i, j) -> i%10 > j%10 ? 1 : -1);  // "Collections Class" (used to print the values in 'Ascending order small to big')
		
		for(Integer o: values) {  
			System.out.println(o);
		}
	}
	
	/*
	output:
	453
	254
	378
	109
	 */
}
