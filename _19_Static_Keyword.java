//package com.Concepts;

//                                                   Static Keyword

//If we create a static variable, the static variable's value is same to all Objects.

//	class Emp{
//	    int eid;
//	    String eName;
//	    int salary;
//	    static String ceo;  
//	
//	    public void show(){  //this is used to print the values
//	        System.out.println(eid + ":" + eName+ ":" + salary + ":" + ceo);
//	    }
//	}
//	public class _19_Static_Keyword {
//	    public static void main(String[] args){
//	        Emp raja=new Emp();
//	        raja.eid=4;
//	        raja.eName="Raja";
//	        raja.salary=30000;
//	        raja.ceo="kevin";
//	
//	        Emp kumar=new Emp();
//	        kumar.eid=5;
//	        kumar.eName="Kumar";
//	        kumar.salary=20000;
//	        kumar.ceo="kevin";
//	        
//	        raja.show();
//	        kumar.show();
//	    }
//	}

/*
output:
4:Raja:30000:kevin
5:Kumar:20000:kevin
 */

//                                     changing static Instance variable's value
/*
class Emp{
    int eid;
    String eName;
    int salary;
    static String ceo;  //static keyword used here

    public void show(){  //this is used to print the values
        System.out.println(eid + ":" + eName+ ":" + salary + ":" + ceo);
    }
}
public class _19_Static_Keyword {
    public static void main(String[] args){
    	Emp raja=new Emp();
        raja.eid=4;
        raja.eName="Raja";
        raja.salary=30000;
        raja.ceo="kevin";

        Emp kumar=new Emp();
        kumar.eid=5;
        kumar.eName="Kumar";
        kumar.salary=20000;
        kumar.ceo="kevin";
        
        kumar.ceo="Nikitha";  // changing static Instance variable's value
        
        raja.show();
        kumar.show();
    }
}*/

/*
output:
4:Raja:30000:Nikitha
5:Kumar:20000:Nikitha
 */

//this Static Variable's value is same to all Object, so we can use 'Class name' "Emp" instead of 'Object References'.
/*
class Emp{
    int eid;
    String eName;
    int salary;
    static String ceo;  //static keyword used here

    public void show(){  //this is used to print the values
        System.out.println(eid + ":" + eName+ ":" + salary + ":" + ceo);
    }
}
public class _19_Static_Keyword {
    public static void main(String[] args){
    	Emp raja=new Emp();
        raja.eid=4;
        raja.eName="Raja";
        raja.salary=30000;
        Emp.ceo="kevin";  // this Static Variable's value same to all Object, so we can use Class name "Emp" instead of Object Reference

        Emp kumar=new Emp();
        kumar.eid=5;
        kumar.eName="Kumar";
        kumar.salary=20000;
        Emp.ceo="kevin";
        
        Emp.ceo="Nikitha";  // changing static Instance variable's value
        
        raja.show();
        kumar.show();
    }
}*/

/*
output:
4:Raja:30000:Nikitha
5:Kumar:20000:Nikitha
 */

//                                     This program is used by "constructor"

//If we create a static variable, the static variable's value is same to all Objects.
// static variable value execute only once, it doesn't matter how many Object created.

class Emp{
    int eid;
    String eName;
    int salary;
    static String ceo;  //static keyword used here
    
    static{  //static Block
        ceo="kevin";
        System.out.println("in static");  // when you Load a 'class' (it will execute 'one time')
    }
    public Emp(int eid, String eName, int salary){  // constructor Block
        this.eid=eid;
        this.eName=eName;
        this.salary=salary;
        System.out.println("in constructor");  // when you create a 'Object' (it will execute 'multiple times')
    }
    public void show(){   // Method Block
        System.out.println(eid + ":" + eName+ ":" + salary + ":" + ceo);
    }
}
public class _19_Static_Keyword {
    static int i;  // outside the Method we should use "static" keyword to Data type 
    public static void main(String[] args){
        i=1;      
        Emp raja=new Emp(1,"raja", 20000);
        Emp kumar=new Emp(2,"kumar", 10000);
        
        raja.show();
        kumar.show();
    }
}

/*
output:
in static
in constructor
in constructor
1:raja:20000:kevin
2:kumar:10000:kevin
 */
