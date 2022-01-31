//package com.Concepts;

// This keyword is used to define 'Instance variables' and 'Local variables within the parameter' are not same variables.
class Math {
    int num1;  // Instance Variables
    int num2;
    int num3;
    int result;

    public Math(int num1, int num2, int num3) {  // within the parameter are Local variables
        this.num1 = num1;  // this keyword 
        this.num2 = num2;  // Current Instance
        this.num3 = num3;
        result=num1+num2+num3;
    }
}

public class _17_This_Keyword{
    public static void main(String[] args){

        Math obj=new Math(5,3,4);

        System.out.println(obj.num1);
        System.out.println(obj.num2);
        System.out.println(obj.num3);
        System.out.println(obj.result);


    }
}
