//package com.Concepts;

//                                             Constructor Overloading

// Same Constructor name with Different Parameter is called Constructor Overloading.

//                                         Default Constructor values

class Casio{
    int num1;
    int num2;
    String operator;

    public Casio(){  //Default Constructor 
        num1=0;
        num2=0;
        operator="nothing";
    }
    public Casio(int i){  // Parameterized Constructor
        num1=i;
        num2=0;
        operator="nothing";
    }
    public Casio(int i, int j){  // Parameterized Constructor
        num1=i;
        num2=j;
        operator="nothing";
    }
    public Casio(int i, int j, String op){  // Parameterized Constructor
        num1=i;
        num2=j;
        operator=op;
    }
}
public class _18_Constructor_Overloading {
    public static void main(String[]args){
    
    	Casio obj=new Casio();  // Default Constructor values
    
    	System.out.println(obj.num1);
    	System.out.println(obj.num2);
    	System.out.println(obj.operator);

    }
}

/*
output:
0
0
nothing
 */

//                                             Parameterized Constructor values
/*
class Casio{
    int num1;
    int num2;
    String operator;

    public Casio(){  //Default Constructor 
        num1=0;
        num2=0;
        operator="nothing";
    }
    public Casio(int i){  // Parameterized Constructor
        num1=i;
        num2=0;
        operator="nothing";
    }
    public Casio(int i, int j){  // Parameterized Constructor
        num1=i;
        num2=j;
        operator="nothing";
    }
    public Casio(int i, int j, String op){  // Parameterized Constructor
        num1=i;
        num2=j;
        operator=op;
    }
}
public class _18_Constructor_Overloading {
    public static void main(String[]args){
    
    	Casio obj=new Casio(2, 3, "Raja");  // Parameterized Constructor values
    
    	System.out.println(obj.num1);
    	System.out.println(obj.num2);
    	System.out.println(obj.operator);

    }
}*/
/*
output:
2
3
Raja
 */

