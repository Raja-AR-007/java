//                             Class and Objects (1:21:23)
//package com.Concepts;

//                                              Class Object

//                                            Object Reference

//class Calculator {
//    
//}
//public class _14_Class_Object {
//    public static void main(String[] args){
//
//        Calculator obj1;  // This is reference
//        obj1=new Calculator();    // obj1 is a Object Reference
//      
//    }
//}


//                                            Creating Multiple Object and object references
// Class is blueprint to all Object.
// Without class we can't create Object.

//class Calculator {
//    int num1;
//    int num2;
//    int result;
//
//    public void perform(){  //Method Block
//        result=num1+num2;
//    }
//}
//public class _14_Class_Object {
//    public static void main(String[] args){
//
//        Calculator obj1=new Calculator();    // obj is a Object Reference 
//        obj1.num1=3;
//        obj1.num2=4;
//
//        Calculator obj2=new Calculator();
//        obj2.num1=4;  // Multiple Objects
//        obj2.num2=4;
//
//        obj1.perform();
//        obj2.perform();
//        System.out.println("First addition is: " + obj1.result);
//        System.out.println("Second addition is: " + obj2.result);
//    }
//}


//output:
//First addition is: 7
//Second addition is: 8
 

/***********************************************************************************************************************/

//                           "Class Object" using Constructor, Method.
//In this program "result" variable is created in the class

//class Calculator {
//    int num1;
//    int num2;
//    int result;
//    public Calculator(int a, int b){   // Parameterized Constructor 
//        num1=a;
//        num2=b;
//    }
//    public void perform(){  // Method 
//        result=num1+num2;
//    }
//}
//public class _14_Class_Object {
//    public static void main(String[] args){
//
//        Calculator obj1=new Calculator(10,17);    // obj is a Object Reference 
//        Calculator obj2=new Calculator(24,19);
//
//        obj1.perform();
//        obj2.perform();
//        System.out.println(obj1.result);   //this line will change in below program
//        System.out.println(obj2.result);   //this line will change in below program
//    }
//}  

/*
output:
27
43
 */

/***********************************************************************************************************************/

//                           "Class Object" using Constructor, Method.
//In this program "result" variable is not created in the class
// because printing statement is in the Method block 
class Calculator {
    int num1;
    int num2;
    
    public Calculator(int a, int b){   // Parameterized Constructor 
        num1=a;
        num2=b;
    }
    public void perform(){  // Method 
        System.out.println(num1+num2);
    }
}
public class _14_Class_Object {
    public static void main(String[] args){

        Calculator obj1=new Calculator(5,7);    // obj is a Object Reference 
        Calculator obj2=new Calculator(4,9);

        obj1.perform();
        obj2.perform();
    }
}  

/*
output:
12
13
 */
