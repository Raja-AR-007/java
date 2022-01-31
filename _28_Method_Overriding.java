package com.Concepts;

//                                Method Overriding

class I{
    public void show(){
        System.out.println("in I");
    }
}
class J extends I{
    @Override   //this will keep the method name will be same otherwise it will show error
    public void show(){    //overriding
        System.out.println("in J");
    }
}
public class _28_Method_Overriding {
    public static void main (String args []){
        J obj1=new J();
        obj1.show();
    }
}

/*
output:
in J
 */

//                          Super Method used in "Method Overriding"
/*
class I{
    int i;
    public void show(){
        System.out.println("in I");
        System.out.println(i);
    }
}
class J extends I{
    int i;
    @Override   //this will keep the method name will be same otherwise it will show error
    public void show(){    //overriding
        super.i=3;   // we can assign a value for parent calss variable here
        super.show();   //this line repesent parent class method here
        System.out.println("in J");
    }
}
public class _28_Method_Overriding {
    public static void main (String args []){
        J obj1=new J();
        obj1.show();
    }
}  */

/*
output:
in I
3
in J
 */
