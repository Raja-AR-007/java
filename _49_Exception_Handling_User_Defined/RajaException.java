package com.Concepts.Exception_Handling_User_Defined;

public class RajaException extends Exception {  //Open Declaration of Exception 'press F3 key'
	
	public RajaException(String msg) {
		
		//msg="This not possible"; // it will not work. in output it will show "null", if we use this statement
		
		super(msg);  //super() Method belongs to Exception
	}
}