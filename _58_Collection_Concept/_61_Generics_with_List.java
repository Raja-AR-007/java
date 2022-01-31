//package com.Concepts.Collection_Concept;

import java.util.ArrayList;
import java.util.List;

//                                                Generic with List (1.5)

//By using Generic we can define the value should be Integer, String, Double values (Object element)

public class _61_Generics_with_List {
	public static void main(String args[]) {

//                                     'Integer' Object elements
// In 1.7 we don't want to Mention the 'Data type' in right side of ArrayList<> Angular bracket.
		/*
		List<Integer> values=new ArrayList<Integer>();  // Generic with List 1.5
		values.add(3);  // Integer v=new Integer(3);
		values.add(2);
		values.add(5);
		values.add(2,6);  // ('2' is Index Number, '6' is value or Object element) changing the Index Number of value 5
		//values.add("4");  // error
		
		for(Integer o: values) {  // Enhanced for Loop
			
			System.out.println(o);
		}*/
	/*
	output:
	3
	2
	6
	5
	 */
		
//                                         'String' Object elements
		/*
		List<String> values=new ArrayList<String>();  // Generic with List 1.5
		values.add("3");  // Integer v=new Integer(3);
		values.add("5");
		values.add("7");
		values.add(2,"8");  // ('2' is Index Number, "8" is value or Object element) changing the Index Number of value 5
		//values.add("4");  // error
		
		for(String o: values) {  // Enhanced for Loop
			
			System.out.println(o);
		}*/
	/*
	output:
	3
	5
	8
	7
	 */
		
//                                           'Double' Object elements
// In 1.7 we don't want to Mention the 'Data type' in right side of ArrayList<> Angular bracket.
		List<Double> values=new ArrayList<>();  // Generic with List 1.7
		values.add(2.4);  // Integer v=new Integer(3);
		values.add(5.7);
		values.add(8.9);
		values.add(2,3.2);  // ('2' is Index Number, "8" is value or Object element) changing the Index Number of value 5
		//values.add("4");  // error
		
		for(Double o: values) {  // Enhanced for Loop (we can create Double in Argument or We can let it as Object)
		
			System.out.println(o);
		}
	/*
	output:
	2.4
	5.7
	3.2
	8.9
	*/
	}
}
