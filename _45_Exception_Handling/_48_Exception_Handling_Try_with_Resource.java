//package com.Concepts.Exception_Handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class _48_Exception_Handling_Try_with_Resource {

//                          Exception is not Handled in Catch block. it will close the Exception in finally block
	/*
	public static void main(String args[]) throws Exception   //it is used when BufferedReader created
	{
		
		System.out.println("Enter a String as a Number: ");
		int n=0;
		BufferedReader br=null;
		try
		{  
			br = new BufferedReader(new InputStreamReader(System.in));  //Resource or exception
			n = Integer.parseInt(br.readLine());  // 45                 //Resource or exception
		} 
		// Always better to create close in 'finally block'.
		finally {  // Close the Resources in Finally block 
			br.close();  //After using the Resources we have to close it. otherwise it occupies more memory
			System.out.println("Close");
		}
		System.out.println(n);
	}  */

/*                            
output 1:                      
Enter a String as a Number: 
67  // String
Close
67  // Converted as a Integer

output 2:
Enter a String as a Number: 
rger  // Must String as a Number 
Close
Exception in thread "main" java.lang.NumberFormatException: For input string: "tehrth"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at com.Concepts.Exception_Handling.Exception_Handling_Try_with_Resource.main(Exception_Handling_Try_with_Resource.java:20)
 */

//                                        Exception Handling "Try with Resource"

// Not compulsory to use the 'Finally block' in 1.7 version.
// if we used BufferedReader we should "throws Exception" on Method.
	public static void main(String args[]) throws Exception   //it is used when BufferedReader created
	{
		
		System.out.println("Enter a String as a Number: ");
		int n=0;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))  //Try with Resource
		{  
			n = Integer.parseInt(br.readLine());  // 45         //Resource or exception
		} 
		
		System.out.println(n);
	}

/*
output:
Enter a String as a Number: 
56   // String
56   // converted into Integer
 */
}

