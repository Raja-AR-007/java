//package com.Concepts;

//                                  Method Overloading

// Same Method name with Different Parameter method is called Method Overloading.

class Equation{
    public void plus(int i, int j){  // Method 
        System.out.println(i+j);
    }
    public void plus(int i, int j, int k){  // different parameter
        System.out.println(i+j+k);
    }
    public void plus(double i, double j){  // different parameter
        System.out.println(i+j);
    }
    public void plus(double i, double j, double k){  // different parameter
        System.out.println(i+j+k);
    }
}
public class _18_Method_OverLoading {
    public static void main(String[] args){
        
    	Equation obj=new Equation();
        
    	obj.plus(1, 3);
    	obj.plus(4, 5, 9);
    	obj.plus(1.2, 4.3);
    	obj.plus(1.1, 4.3, 6.4);
    }
}

/*
output:
4
18
11.8
5.5
 */
