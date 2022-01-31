package com.Concepts.Collection_Concept;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Set allow only unique Elements.
// Set Interface will not repeat the valu.es or element. 

public class _65_Set_Interface {
	public static void main(String args []) {
		
//                                  HashSet in Set Interface
// HashSet Method will follow some Algorithm so that,
// It will not give the values sequence.
		/*
		Set<Integer> values= new HashSet<>();  // HashSet will not give the values sequence
		values.add(23);
		values.add(34);
		values.add(12);
		values.add(12);  //will not repeat the values
		
		for(Integer o:values) {
			System.out.println(o);
		}*/
		
		/*
		output:
		34
		23
		12
		 */
		
		/*
		Set<Integer> values= new HashSet<>();  // HashSet will not give the values sequence
		System.out.println(values.add(23));
		System.out.println(values.add(34));
		System.out.println(values.add(12));
		System.out.println(values.add(12));  // duplicate means false
		
		for(Integer o:values) {
			System.out.println(o);
		}*/
		
		/*
		output:
		true  
		true
		true
		false  // duplicate
		34
		23
		12
		 */

//                                         TreeSet in Set Interface
// TreeSet will give values in sequence.
		
		Set<Integer> values= new TreeSet<>();  // TreeSet will give values in sequence
		System.out.println(values.add(23));
		System.out.println(values.add(34));
		System.out.println(values.add(12));
		System.out.println(values.add(12));  // duplicate means false
		
		for(Integer o:values) {
			System.out.println(o);
		}
		
		/*
		output:
		true
		true
		true
		false
		12
		23
		34
		 */
	}
}
