//package com.Concepts;

//                                    Inherited Class

//	class Raja{
//	    public void show(){
//	        System.out.println("in Raja show");
//	    }
//	}
//	class Dhiva extends Raja{
//	    public void show(){
//	        System.out.println("im the best");
//	    }
//	}
//	
//	public class _37_Anonymous_Class {
//	    public static void main(String args[]){
//	        Raja obj1=new Dhiva();
//	        obj1.show();
//	    }
//	}

/*
output:
im the best
 */

//                                   "Anonymous Class" in Inherited class
// Methods will create within the Object Creating area.
/*
class Raja{
    public void show(){
        System.out.println("in Raja show");
    }
}
public class _37_Anonymous_Class {
    public static void main(String args[]){

        Raja obj1=new Raja(){   //Anonymous Class
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

//                                     Interface
/*
interface Raja{
    void show();
}
class Dhiva implements Raja{
    public void show(){
        System.out.println("im the best");
    }
}
public class _37_Anonymous_Class{
    public static void main(String args[]){
        Raja obj1=new Dhiva();
        obj1.show();
    }
}

/*
output:
im the best
 */

/* Types of Interface:
 * 1.Normal.
 * 2.Single Abstract method (or) Functional Interface - Lambda Expression -> "Scala" Language.
 * 3.Marker Interface
 */

//                               "Anonymous Class" in Interface
// Methods will create within the Object Creating area.
// By using 'Anonymous Class' we can avoid 'sub Classes' and we can reduce coding lines

interface Raja{
    void show();
}
public class _37_Anonymous_Class{
    public static void main(String args[]){

        Raja obj1=new Raja(){   //Anonymous Class
                    public void show(){
                        System.out.println("im the best");
                    }
        		};
        obj1.show();
    }
}

/*
output:
im the best
 */

