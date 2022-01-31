///package com.Concepts;

//                                         Class
/*
class Human{  
    public void eat() {
    	
    }
    public void walk() {

    }  
}
public class _32_Abstract_Keyword {
    public static void main(String args[]){
        Human obj1=new Human();  // we can create Object to Class
    }
}*/

//                                                Abstract Class
// we can't create Object for Abstract class.
/*
abstract class Human{  
    public void eat() {
    	
    }
    public void walk() {

    }  
}
public class _32_Abstract_Keyword {
    public static void main(String args[]){
        Human obj1=new Human();  // can't create Object for Abstract class
    }
}*/

// If we want to extend Abstract class, we should define '{}' a Method in sub Class, Which Method is Declared ';' in Abstract Class.
// By using Abstract in a Method we can Declare.

abstract class Human{   //Abstract Class
	public abstract void eat();   //declared in Abstract Class

	public void walk() {

	}  
}
class Men extends Human{  //Concrete Class
	public void eat(){   //Defined Method

	}
}
public class _32_Abstract_Keyword {
	public static void main(String args[]){
		Human obj1=new Men();   //reference of Abstract class = object of sub class
								
	}
}
