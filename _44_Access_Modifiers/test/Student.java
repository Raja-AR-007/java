package com.Concepts.Access_Modifiers.test;

public class Student {
	
	int age=22;   //By default this variable is "Private"
	public int rollNo=5;   //we can use this variable from "anywhere" or "another Package"
	private String name="Raja";  //we can't use this from "anywhere"
	protected int marks=55;   //we can access this variable in same package or "different class with same packages"
}
