//package com.Concepts;

//                            Final Keyword in Variables

class X{
    final int a;  //"Final keyword" is a "Constant" cannot change the assigned value in variable.
    public X(){
        a=4;
    }
}
public class _34_Final_Keyword {
    public static void main(String args[]){
        X obj1=new X();

        System.out.println(obj1.a);
    }
}

/*
output:
4
 */

//                            Final Keyword in Class
//If we put "Final Keyword" in super class will not (inherit) or (extends) in sub class.
/*
final class X{   //Final keyword in a Class
    public void show(){
        System.out.println("in X show");
    }
}
class Y extends X{   //Error in this Line 
    public void show(){
        System.out.println("in Y show");
    }
}
public class _34_Final_Keyword {
    public static void main(String args[]){
        Y obj1=new Y();
        obj1.show();
    }
}*/

//                            Final Keyword in Method
//If we put "Final Keyword" in Method and it will not Override the Method.
/*
class X{
    public final void show(){   //Final keyword in a Method
        System.out.println("in X show");
    }
}
class Y extends X{
    public void show(){   //Error in this Line
        System.out.println("in Y show");
    }
}
public class _34_Final_Keyword {
    public static void main(String args[]){
        Y obj1=new Y();
        obj1.show();
    }
}*/


