//package com.Concepts;
//                                        Class

//	class Pen{
//	    public void write(){
//	        System.out.println("i am a pen");
//	    }
//	}
//	class Pencil{
//	    public void write(){
//	        System.out.println("i am a pencil");
//	    }
//	}
//	class Kit{
//	    public  void doSomthing(Pen p){
//	        p.write();
//	    }
//	    public void doSomthing(Pencil pcl){
//	        pcl.write();
//	    }
//	}
//	public class _35_Interface_Basic {
//	    public static void main(String args[]){
//	        Kit k=new Kit();
//	        Pen p=new Pen();
//	        k.doSomthing(p);
//	        Pencil pcl=new Pencil();
//	        k.doSomthing(pcl);
//	    }
//	}

/*
output:
i am a pen
i am a pencil
 */

/***********************************************************************************************************************/

//                                    Inherited Class
 /*
class Writer {
    public void write() {

    }
}
class Pen extends Writer{
    public void write(){
        System.out.println("i am a pen");
    }
}
class Pencil extends Writer{
    public void write(){
        System.out.println("i am a pencil");
    }
}
class Kit{
    public  void doSomthing(Writer p){
        p.write();
    }
}
public class _35_Interface_Basic {
    public static void main(String args[]){
        Kit k=new Kit();
        Writer p=new Pen();
        k.doSomthing(p);
        Writer pcl=new Pencil();
        k.doSomthing(pcl);
    }
}*/

/*
output:
i am a pen
i am a pencil
 */

/************************************************************************************************************************/

//                                   Using "Abstract Keyword" in Inherited Class
// we can use Abstract if we want to define method '{}'.
/*
abstract class Writer {
    public void write(){   //Method is Defined '{}'

    }
}
class Pen extends Writer{
    public void write(){
        System.out.println("i am a pen");
    }
}
class Pencil extends Writer{
    public void write(){
        System.out.println("i am a pencil");
    }
}
class Kit{
    public  void doSomthing(Writer p){
        p.write();
    }
}
public class _35_Interface_Basic {
    public static void main(String args[]){
        Kit k=new Kit();
        Writer p=new Pen();
        Writer pcl=new Pencil();
        k.doSomthing(p);
        k.doSomthing(pcl);
    }
}

/*
output:
i am a pen
i am a pencil
 */

/************************************************************************************************************************/

//                                       Using Interface
// "Interface concept is used to achieve the Multiple Inheritance bc'z Java doesn't support Multiple Inheritance".
// Abstract is Default in Interface and in Interface Method.
// we can use interface if we want to "Declare Methods" ';' cannot "Defining Method" '{}'.

// In this Program writer() Method of Pen class and Pencil class are  fetched in the Interface Writer.

interface Writer{
    void write();  //we can only declare ';' the Method in Interface
}
class Pen implements Writer{
    public void write(){
        System.out.println("i am a pen");
    }
}
class Pencil implements Writer{
    public void write(){
        System.out.println("i am a pencil");
    }
}
class Kit{
    public  void doSomthing(Writer p){
        p.write();
    }
}
public class _35_Interface_Basic {
    public static void main(String args[]){
        Kit k=new Kit();
        Writer p=new Pen();
        Writer pcl=new Pencil();
        k.doSomthing(p);
        k.doSomthing(pcl);

    }
}

/*
output:
i am a pen
i am a pencil
 */
