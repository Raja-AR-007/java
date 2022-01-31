//package com.Concepts.Exception_Handling;

//Any classes will comes with help of 'io'. they are Resources.
import java.io.BufferedReader;

import java.io.InputStreamReader; 


public class _47_Checked_Exception_and_Finally_block {
	public static void main(String args[]) throws Exception  //instead of this we can use another way below program
	{
		
		System.out.println("Enter a Number: ");
		
		// if we used buffer reader we should 'throw Exception'
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));  //Resource or exception
		
		int n=Integer.parseInt(br.readLine());  // 45     //Resource
		
		System.out.println(n);
	}
}

/*
output:
Enter a Number: 
78
78
 */

//                                  Without using "throws Exception"
/*
public class _47_Checked_Exception_and_Finally_block {
	public static void main(String args[]) 
	{
		
		System.out.println("Enter a Number: ");
		int n=0;
		BufferedReader br=null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));  //Resource or exception
			n = Integer.parseInt(br.readLine());  // 45                 //Resource or exception
			// Try block Exception directly jumps to catch block. it will not close when Exception upon the close.
			br.close();  //After using the Resources we have to close it. otherwise it occupies more memory
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println(n);
	}
}*/

/*
output:
Enter a Number: 
78
78
*/

//                                            Using "Finally block"
/*
public class _47_Checked_Exception_and_Finally_block {
	public static void main(String args[]) throws Exception  //it is used when BufferedReader and finally block created
	{
		
		System.out.println("Enter a Number: ");
		int n=0;
		BufferedReader br=null;
		try {  // create resources in 'Try block'
			br = new BufferedReader(new InputStreamReader(System.in));  //Resource or exception
			n = Integer.parseInt(br.readLine());  // 45                 //Resource or exception
		}
		catch(Exception e){  // Handle the Resources in 'Catch block'
			System.out.println(e);
		}
		// Always better to create close in 'finally block'.
		finally {  // Close the Resources in Finally block 
			br.close();  //After using the Resources we have to close it. otherwise it occupies more memory
		}
		System.out.println(n);
	}
}
*/
/*
output:
Enter a Number: 
#@eygth
java.lang.NumberFormatException: For input string: "#@eygth"
0
*/
