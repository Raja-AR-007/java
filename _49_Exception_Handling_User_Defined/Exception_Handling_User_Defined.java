package com.Concepts.Exception_Handling_User_Defined;

// User Defined function is used to create message in a try block.

// If we want to create message in try block, we should create one more sub class for Exception.
// "class RajaException extends Exception" in another file.
// In that class we can create method for message.

public class Exception_Handling_User_Defined {
	public static void main(String[] args) {
		
		int i, j;
		i=8;
		j=9;  //Listen the values
		
		try {
		int k=i/j;
		
		if(k==0) 
			// throw new Exception();  // Normal statement. we can create message in Object parameter
			throw new RajaException("This is not Possible 8 will not divide 9");  // 'User Defined' Exception Handling
		
		System.out.println(k);
		}
		catch(RajaException e) {
			System.out.println("Error " + e.getMessage());  // we should get message in here
		}
	}
}
/* 
output:
Error This is not Possible
*/