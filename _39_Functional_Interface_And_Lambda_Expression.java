//package com.Concepts;

//                               "Anonymous Class" in Functional Interface
// Methods will create within the Object Creating area.

//                       Lambda Expression
/*
interface Raj{
    void show();
}
public class _39_Functional_Interface_And_Lambda_Expression{
    public static void main(String args[]){

        Raj obj1=new Raj(){
                     public void show(){
                     System.out.println("im the best");
                 }
        };
        obj1.show();
    }
}*/

/*
output:
im the best
 */



//                         "Functional Interface and Lambda Expression" in Anonymous Class

// In 'Anonymous Class' we can Method will create within the Object Creating area.

// Lambda Expression is 1.8.
// If a Method is a @FunctionalInterface we can use lambda expression.

@FunctionalInterface  //Functional Interface will have only one Method
interface Raj{
    void show();
}
public class _39_Functional_Interface_And_Lambda_Expression{
    public static void main(String args[]){

        Raj obj1=() -> System.out.println("im the best");  //Lambda Expression
        obj1.show();
    }
}

/*
output:
im the best
 */
