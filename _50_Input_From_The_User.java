//package com.Concepts;
import java.util.Scanner;  //Note this Line

public class _50_Input_From_The_User {

	public static void main(String[] args) {
		
		//                          "Integer Input" From The User
		/*
		int a;
		int b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number 1: ");
		a=sc.nextInt();
		
		System.out.println("Enter a Number 2: ");
		b=sc.nextInt();
		
		int c=a+b;
		
		System.out.println("Result= " + c);
		*/
		
		/*
		output:
		Enter a Number 1: 
		5
		Enter a Number 2: 
		8
		Result= 13
		 */
		
		//                          "String Input" From The User
		/*
		String name;
		
		Scanner sc2=new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		name=sc2.nextLine();
		
		System.out.println("Your Name is " +name);
		*/
		
		/*
		output:
		Enter Your Name: 
		Raja
		Your Name is Raja
		 */
		
		//                          "Floating or Decimal Input" From The User

		double num1;
		double num2;
		
		Scanner sc3=new Scanner(System.in);
		
		System.out.println("Enter a Number 1: ");
		num1=sc3.nextDouble();
		
		System.out.println("Enter a Number 2: ");
		num2=sc3.nextDouble();
		
		double num3=num1+num2;
		
		System.out.println("Result= " + num3);
		
		
		/*
		output:
		Enter a Number 1: 
		5.76574674
		Enter a Number 2: 
		6.6346346
		Result= 12.40038134
		 */
		
	}

}
