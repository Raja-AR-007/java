//package com.Concepts.Exception_Handling;

//                                    Exception Handling

// 'Exception handling' is used to handle the Error giving programs. 
// we can create error giving Exceptions (codes) within the 'Try block' and 'Catch block' will Handle the Exceptions.
// Finally block is used to close the Exception or we can use it when we want.

public class _45_Exception_Handiling_Try_Catch_Finallly {
	public static void main(String args[]) {
		
		//                          without using "Finally Block"
	try {
		int a=8;  //check variable values for all programs
		int b=4;
		int c=a/b;
		System.out.println("Result: "+c);
		System.out.println("Bye in try");  //it will show when there is "No error" occurs
	}
	catch(ArithmeticException e) {   //'Catch block' will execute when error occurs
		System.err.println("Error");
		System.err.println("Bye in catch");  
	}
		
	/*
	 output:
	 Result: 2
	 Bye in try
	 */
	
		
	    //                          without using "Finally Block"
//	try {
//		int a=8;
//		int b=0;  //check variable values for all programs
//		int c=a/b;
//		System.out.println("Result: "+c);
//		System.out.println("Bye in try");  //it will show when there is "No error" occurs
//	}
//	catch(ArithmeticException e) {   //'Catch block' will execute when error occurs
//		System.err.println("Error");
//		System.err.println("Bye in catch");  
//	}
		
	/*
	 output:
	 Error   //Error is in red color. b'cz we used err statement in printing statement
	 Bye in catch   //it is also in red color
	 */
		
	                                 
									// try, catch, finally
	
		// we can use critical statements called 'Exception' in "Try Block".
		// if "Try block" will gives '0' (Zero) result and it also 'considered as Error'. (check below program)
		
//	try {    //try block will throw the Exception
//		int a=8;
//		int b=4;  //check variable values for all programs
//		int c=a/b;
//		System.out.println("Result: "+c);
//	}
//	// In Catch block if the try block is in 'normal situation' Catch block 'will not executed'.
//	// In Catch block if the try block is in 'Error situation' Catch block 'will executed'.
//	catch(ArithmeticException e) {    //Catch block will catch Try block Exception
//		System.err.println("Error");
//	}
//	//Finally block will executed even we will 'getting a exception' or 'not getting exception'.
//	//finally block will execute in both 'normal situation' or 'error situation'.
//	finally {
//		System.out.println("Bye for both try and catch in Finally");
//	}
		
	/*
	 output:
	 Result: 2
	 Bye for both try and catch in Finally
	 */
		
	
	                                          // try, catch, finally
	
//	try {   //'try block' will throw the Exception
//		int a=8;
//		int b=0;  //check variable values for all programs
//		int c=a/b;
//		System.out.println("Result: "+c);
//	}	
//	catch(ArithmeticException e) {   //'Catch block' get execute in error situation and it will catch Try block Exception
//		System.err.println("Error");
//	}
//	finally {   //'finally block' execute in error or normal situation
//		System.out.println("Bye for both try and catch in Finally");
//	}
		
	/*
	 output:
	 Error   //it is red color
     Bye for both try and catch in Finally
	 */
	}

}
