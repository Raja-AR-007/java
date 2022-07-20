package com.Concepts;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// printf - scanf
// cout - cin
// System.out.println() - System.in.read()

// BufferdeReader
// Scanner

/*
public class BufferedReader_User_Input {

	public static void main(String[] args) throws Exception{
		
		System.out.println("Enter a number: ");
		
		int n=System.in.read();
		
		System.out.println(n);
	}
}*/

/*
output:
Enter a number: 
raja
114
 */

public class BufferedReader_User_Input {

	public static void main(String[] args) throws Exception{

//                                            BufferedReader User Input
// if we used BufferedReader we should "throws Exception" on Method.
		
		System.out.println("Enter a String as a Number: ");
		
		InputStreamReader is=new InputStreamReader(System.in);
		
		BufferedReader br =new BufferedReader(is);  //pass reference variable 'is' of 'InputStreamReader Object' within the parameter
		
		// parseInt() is used to convert a 'String' into 'Integer'. 'only String should be a number' for example "45" to 45.
		int n1=Integer.parseInt(br.readLine());  
		
		System.out.println(n1);  
		
/*
output:
Enter a String as a Number: 
45   // String
45   // converted into Integer
*/

//                                          BufferedReader User Input
		/*
		System.out.println("Enter a String as a Number: ");
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  // (put whole object within the parameter) see above program
		
		// parseInt() is used to convert a 'String' into 'Integer'. 'only String should be a number' for example "45" to 45.
		int n2=Integer.parseInt(br.readLine());  
		
		System.out.println(n2);  
		*/
/*
output:
Enter a String as a Number: 
45   // String
45   // converted into Integer
*/

//                                           Scanner User Input
		/*
		System.out.println("Enter a number: ");
		
		int n;
		Scanner sr= new Scanner(System.in);
		
		n = sr.nextInt();
		
		System.out.println(n);  */
	}
}

/*
output:
Enter a number: 
123    // Integer
123    // Integer
 */
