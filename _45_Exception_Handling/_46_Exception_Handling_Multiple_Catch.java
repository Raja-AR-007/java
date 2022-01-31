package com.Concepts.Exception_Handling;

public class _46_Exception_Handling_Multiple_Catch {
	public static void main(String args []) {
		
		/*
		// we can use critical statements called 'Exception' in "Try Block".
		// if "Try block" will gives '0' (Zero) result and it also 'considered as Error'.
		//try block will throw the Exception
		try {    
			int i[]=new int [8];
			i[9]=6;    //index of 5th position is changed
			int a=8;
			int b=4;  
			int c=a/b;
			System.out.println("Result of Division: "+c);
			System.out.println("Array Result: "+i[5]);
		}
		// In Catch block if the try block is in 'normal situation' Catch block 'will not executed'.
		// In Catch block if the try block is in 'Error situation' Catch block 'will executed'.
		catch(ArithmeticException e) {    //Catch block will catch the exception
			System.err.println("cannot divide by zero ");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("stay in your limits on Array ");
		}
		//Finally block will executed even we will 'getting a exception' or 'not getting exception'.
		//finally block will execute in both 'normal situation' or 'error situation'.
		finally {
			System.out.println("Bye in finally");
		}*/
		
		/*
		output:
		Error in Array 
		Bye in finally
		 */
		
		
		
//	try {   
//		int i[]=new int [8];
//		//int i[]=null;
//		i[7]=6;    //index of position is changed
//		int a=8;
//		int b=0;  
//		int c=a/b;
//		System.out.println("Result of Division: "+c);
//		System.out.println("Array Result: "+i[7]);
//	}		
//	catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {   //Multiple Catch block
//		System.err.println("Error in any one Exception or Error in both");
//	}
//	catch(Exception e) {
//		System.out.println("something went wrong");
//	}
//	finally {
//		System.out.println("Bye in Finally");
//	}
		
		/*
		output:
		Error in any one Exception or Error in both
 		Bye in Finally
		 */
		
		//                              "Multiple catch" in Exception Handling
		
	try {   //'Try block' have Exception or (Data variables)
		//int i[]=new int [8];
		//int i[]=null;
		int i[]= {3,5,6,2,5};
		i[3]=6;    //index of position is changed
		int a=8;
		int b=2;  
		int c=a/b;
		System.out.println("Result of Division: "+c);
		for(int k:i) {
			System.out.print(k);
		}
	}
	catch(ArithmeticException e) {   //'Catch block' get execute in error situation and it will catch Try block Exception
		System.err.println("cannot divide by zero");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.err.println("stay in your limits on Array");
	}
	catch(Exception e) {   //Exception will do all Activities
		System.err.println("something Wrong");
	}
	finally {   //Finally block get execute in both error situation or normal situation
		System.out.println("Bye in Finally");
	}
		
		/*
		output:
		something Wrong
		Bye in Finally

		 */
		
	}

}
