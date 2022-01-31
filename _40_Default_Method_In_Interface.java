//package com.Concepts;

//                             Default Method
/*
 * Abstract Class -> Define{} and Declare;
 * In 1.7 Interface can Declare; Only.
 * In 1.8 Interface can Define{} Also.
 */
// 'Default Method' is used to Define{} a Method in Interface.
// It will also consider as Functional Interface if we used one Abstract Method.

@FunctionalInterface
interface Deepak{
    void show();
    default void abc(){  //default Method
        System.out.println("in abc");
    }
}
class Kevin implements Deepak{
    public void show(){
        System.out.println("in show");
    }
    public void abc(){   //default Method is Override here
        System.out.println("in New abc");
    }
}
public class _40_Default_Method_In_Interface {
    public static void main(String args[]){
        Deepak obj1=new Kevin();
        obj1.show();
        obj1.abc();
    }
}

/*
output:
in show
in abc
 */
