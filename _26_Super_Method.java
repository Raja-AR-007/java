package com.Concepts;


//	class A{
//	    public A(){   //The first constructor is default constructor
//	        System.out.println("in A");
//	    }
//	    public A(int i){   //parameterized constructor
//	        System.out.println("in A int");
//	    }
//	}
//	class B extends A{
//	    public B(){   //The first constructor is default constructor
//	        System.out.println("in B");
//	    }
//	    public B(int i){   //parameterized constructor
//	        System.out.println("in B int");
//	    }
//	}
//	public class _26_Super_Method {
//	    public static void main(String args[]){
//	
//	        B obj2=new B(3);
//	    }
//	}  

/*
output:
in A
in B int
 */

//                                   Super Method
// Super Method is used to execute the parameterized constructor
/*
class A{
    public A(){   // default non parameterized constructor
        System.out.println("in A");
    }
    public A(int i){   //parameterized constructor
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){   // default non parameterized constructor
        super();
        System.out.println("in B");
    }
    public B(int i){   //parameterized constructor
        super(i);
        System.out.println("in B int");
    }
}
public class _26_Super_Method {
    public static void main(String args[]){
        B obj1=new B(2);
    }
}  */

/*
output:
in A int
in B int
 */

// "Super Method" is used to represent the parameterized constructor in parent class
/*
class A{
    public A(){   // default non parameterized constructor
        System.out.println("in A");
    }
    public A(int i){   //parameterized constructor
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){   // default non parameterized constructor
        super(2);
        System.out.println("in B");
    }
    public B(int i){   //parameterized constructor
        super(i);
        System.out.println("in B int");
    }
}
public class _26_Super_Method {
    public static void main(String args[]){
        B obj1=new B();
    }
}  */

/*
output:
in A int
in B
 */

// super method only use in 'child class' that means 'inherited class'
// Basically "super method" is used to represent 'parent class'
// "Super Method" is used to represent the parameterized constructor in parent class
/*
class A{
    public A(){   // default non parameterized constructor
        System.out.println("in A");
    }
    public A(int i){   //parameterized constructor
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){   // default non parameterized constructor
        super(2);   //changes will be all above programs
        System.out.println("in B");
    }
    public B(int i){   //parameterized constructor
        super(i);    //changes will be all above programs
        System.out.println("in B int");
    }
}
public class _26_Super_Method {
    public static void main(String args[]){
        B obj1=new B(2);  //changes will be all above programs
    }
}  */

/*
output:
in A int
in B int
 */


class M{
    int i;
    public void show(){
        System.out.println("in M");
        System.out.println(i);
    }
}
class N extends M{
    int i;
    @Override   //this will keep the method name will be same otherwise it will show error
    public void show(){    //overriding
        super.i=3;   // we can assign a value for parent class variable here
        super.show();   //this line represent parent class method here
        System.out.println("in N");
    }
}
public class _26_Super_Method {
    public static void main (String args []){
        N obj1=new N();
        obj1.show();
    }
}

/*
output:
in M
3
in N
 */
