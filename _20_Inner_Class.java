//package com.Concepts;

//                           Inner Class (without static keyword)
/*
 * Inner class
 * Member class (without using static keyword)
 * Static class
 * Anonymous class (It is another program)
 */
//The class will have Variables,Methods and Constructors.

//	class Manager{   //Outer Class
//	     int i=3;
//	     int j=7;
//	
//	    public  void show(){
//	        System.out.println(i+j);
//	        System.out.println("in outer class method");
//	    }
//	    class Worker{   //Inner Class (Inner class belongs to outer class)
//	        int a=5;    //outer$Inner.Class  ($ means belongs)
//	        int b=2;
//	        public void display(){
//	            System.out.println(a+b);
//	            System.out.println("in inner calss method");
//	        }
//	    }
//	}
//	public class _20_Inner_Class {
//	    public static void main(String[] args){
//	        Manager obj=new Manager();  //outer class
//	        obj.show();
//	        Manager.Worker obj2=obj.new Worker();  //Inner class
//	        obj2.display();
//	    }
//	}

/*
output:
10         				 //outer class
in outer class method    //outer class
7          				 //Inner class
in inner class method    //Inner class
 */



//                         Program is used by "Static" keyword

//	class Manager{   //Outer Class
//	    static int i=3;
//	    static int j=7;
//	
//	    public static  void show(){
//	        System.out.println(i+j);
//	        System.out.println("in outer class method");
//	    }
//	    static class Worker{   //Inner Class (Inner class belongs to outer class)
//	        int a=5;    //outer$Inner.Class  ($ means belongs)
//	        int b=2;
//	        public void display(){
//	            System.out.println(a+b);
//	            System.out.println("in inner class method");
//	        }
//	    }
//	}
//	public class _20_Inner_Class {
//	    public static void main(String[] args){
//	        Manager obj=new Manager();  //outer class
//	        obj.show();
//	        Manager.Worker obj2=new Manager.Worker();  // Reference changed here when we use "static" keyword
//	        obj2.display();
//	    }
//	}  

/*
output:
10         				//outer class
in outer class method   //outer class
7          				//Inner class
in inner class method   //Inner class
 */
