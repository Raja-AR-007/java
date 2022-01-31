//package com.Concepts;

//                               Static Method In Interface
// If we declared variable in Interface.
// by default variables are "Final" we can't change the value of variables.
// we don't need to create Object to call a Static Method, it'll call automatically

interface Gokul {
    int num1=8;  //variables are "Final" in Interface by default
    int num2=6;
    void abc();

    static void show(){   //static Method in Interface
        System.out.println("hi");
    }
}
class Ravi implements Gokul {
    public void abc(){
        System.out.println(num1+num2);
    }
}
public class _42_Static_Method_In_Interface {
    public static void main(String args[]){
// we don't need to create Object to call a Static Method
        Gokul.show();
        Gokul obj1=new Ravi();
        obj1.abc();
    }
}

/*
output:
hi
14
 */
