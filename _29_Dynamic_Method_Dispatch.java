package com.Concepts;

//                                     Dynamic Method Dispatch

	class A{
	    public void show(){
	        System.out.println("in A");
	    }
	}
	class B extends A{
	    public void show(){
	        System.out.println("in B");
	    }
	}
	class C extends A{
	    public void show(){
	        System.out.println("in C");
	    }
	}
	public class _29_Dynamic_Method_Dispatch {
	    // compile time and runtime
	    public static void main(String args[]){
	
	        A obj1= new B();  //reference of super class = Object of sub class; (runtime polymorphism)
	        obj1.show();
	
	        obj1=new C();  //Dynamic method Dispatch
	        obj1.show();
	    }
	}

/*
output:
in B
in C
 */


//                                     Dynamic Method Dispatch

//	class A{
//	    public void show(){
//	        System.out.println("in A");
//	    }
//	}
//	class B extends A{
//	    public void show(){
//	        System.out.println("in B");
//	    }
//	    public void config(){
//	        System.out.println("in config");
//	    }
//	}
//	class C extends A{
//	    public void show(){
//	        System.out.println("in C");
//	    }
//	}
//	public class _29_Dynamic_Method_Dispatch {
//	    // compile time and runtime
//	    public static void main(String args[]){
//	
//	        A obj1= new B();  // super class, reference = Object of sub class; (runtime polymorphism)
//	        //then only "dynamic method dispatch" will happen below
//	        obj1.show();
//	        obj1.config(); // more method will not work in sub class
//	
//	        obj1=new C();  //dynamic method dispatch
//	        obj1.show();
//	    }
//	}

/*
output;
error   //reason in config()
 */
