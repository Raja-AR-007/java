package com.Concepts;

//                               Encapsulation
//                          getter and setter function

//	class Student{
//	    private int rollNo;
//	    private String name;
//	
//	    public int getRollNo(){
//	        return rollNo;
//	    }
//	    public void setRollNo(int r){
//	        rollNo = r;
//	    }
//	    public String getName(){
//	        return name;
//	    }
//	    public void setName(String n){
//	        name = n;
//	    }
//	}
//	public class _30_Encapsulation {
//	    public static void main (String args[]){
//	        Student obj1= new Student();
//	        obj1.setRollNo(2);
//	        obj1.setName("Raja");
//	
//	        System.out.println(obj1.getRollNo());
//	        System.out.println(obj1.getName());
//	    }
//	}

/*
output:
2
Raja
 */

//                                   Encapsulation
//Encapsulation -> Binding data with method
//getter and setter are used to access private variables
//getter is used to return the value.
//setter is used to Assign or Insert a value.
//This concept is useful in login interface

class Student{
    private int rollNo;
    private String name;

    public int getRollNo(){
        System.out.println("user is accssing the values");
        return rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
        System.out.println("value of rollNo changed");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
public class _30_Encapsulation {
    public static void main (String args[]){
        Student obj1= new Student();
        obj1.setRollNo(2);
        obj1.setName("Raja");

        System.out.println(obj1.getRollNo());
        System.out.println(obj1.getName());
    }
}

/*
output:
value of rollNo changed
user is accssing the values
2
Raja
 */
