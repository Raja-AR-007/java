//package com.Concepts;

//                                      Normal Class

//class Calc{
//    int num1;
//    int num2;
//}
//public class _16_Constructor {
//   public static void main(String[] args){
//       
//   		Calc obj=new Calc();
//   		obj.num1=2;
//   		obj.num2=4;
//   		
//   		System.out.println(obj.num1);
//   		System.out.println(obj.num2);        
//   }
//}

/*
output:
2
4
 */


//                                          Constructor

//Constructor is a Member Method.
//Constructor should be same as class name.
//Constructor is used to Assign values for variables.
//Constructor is used to allocate Memory for Data type.
//Constructor will never return anything.
//If we don't create Constructor in Class, but it is Default in class.
//It will called Automatically When Object is created.

//                                       Default Constructor

//class Calc{
//     int num1;
//     int num2;
//     
//     public Calc(){  //Default Constructor
//         num1=2;
//         num2=4;
//         System.out.println("In Constructor");
//     }
//}
//public class _16_Constructor {
//    public static void main(String[] args){
//          
//    	Calc obj=new Calc();  // Default Constructor value
//        
//        System.out.println(obj.num1);
//        System.out.println(obj.num2);        
//    }
//}

/*
output:
In Constructor
2
4
 */


//                                       Parameterized Constructor values in output

// First Constructor is Default Constructor and other constructors are Parameterized Constructors.

class Calc{
    int num1;
    int num2;
    
    public Calc(){  // Default Constructor 
        num1=2;
        num2=4;
        System.out.println("In Constructor");
    }
    public Calc(int i){  // Parameterized Constructor
        num1=i;
        num2=i;
    }
    public Calc(double j,int i){  // Parameterized Constructor
        num1= (int)j;
        num2=i;
    }
}
public class _16_Constructor {
    public static void main(String[] args){
        
    	Calc obj=new Calc(1.1, 4);  // values in Parameter
        
        System.out.println(obj.num1);
        System.out.println(obj.num2);        
    }
}

/*
output:
1
4
 */
