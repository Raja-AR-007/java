//package com.Concepts;

//                             Multiple Inheritance Issue In Interface

//                                     First  Way to solve 'Issue'
// 'Default Method' is used to Define{} a Method in Interface.
// It will also consider as Functional Interface if we used one Abstract Method.

// If we use same Method in Two interfaces then Issue will come.
// By creating one more Method in sub class and we 'can solve the Issue' (First  Way).

//	@FunctionalInterface
//	interface Demo{
//	    void abc();
//	    default void show(){  //default Method
//	        System.out.println("in Demo show");
//	    }
//	}
//	interface MyDemo{
//	    default void show(){
//	        System.out.println("in MyDemo show");
//	    }
//	}
//	class Kumar implements Demo,MyDemo{   //Multiple Inheritance or Interface
//	    public void abc(){
//	        System.out.println("in abc");
//	    }
//	    public void show(){  //creating one more Method in Sub Class 'to solve issue'
//	        System.out.println("in DemoImp show");
//	    }
//	}
//	public class _41_Multiple_Inheritance_Issue_In_Intherface {
//	    public static void main(String args[]){
//	        Demo obj1=new Kumar();
//	        obj1.abc();
//	        obj1.show();
//	    }
//	}

/*
output:
in abc
in DemoImp show
 */

//                                     Second  Way to solve 'Issue'
// 'Default Method' is used to Define{} a Method in Interface.
// It will also consider as Functional Interface if we used one Abstract Method.

// If we use same Method in Two interfaces then Issue will come.
// Create one more Method in Sub Class by using 'Super Method' within the Method 'can solve the Issue' (Second  Way).

@FunctionalInterface
interface Demo{
    void abc();
    default void show(){  //default Method
        System.out.println("in Demo show");
    }
}
interface MyDemo{
    default void show(){
        System.out.println("in MyDemo show");
    }
}
class Kumar implements Demo,MyDemo{   //Multiple Inheritance or Interface
    public void abc(){
        System.out.println("in abc");
    }
    public void show(){   //creating one more method by using 'Super Method' within the Method
        Demo.super.show();  //we can call particular Method from here
        MyDemo.super.show();
    }
}
public class _41_Multiple_Inheritance_Issue_In_Intherface {
    public static void main(String args[]){
        Demo obj1=new Kumar();
        obj1.abc();
        obj1.show();
    }
}

/*
output:
in abc
in Demo show
in MyDemo show
 */
