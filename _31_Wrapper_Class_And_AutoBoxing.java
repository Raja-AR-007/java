package com.Concepts;

//                               Wrapper Class and Auto boxing
//Normal data variable will be convert into a object reference is called 'Wrapper class or Boxing'

public class _31_Wrapper_Class_And_AutoBoxing {
    public static void main(String args[]){
    	
        //                            wrapper class in "Integer" data
    	// We can create object for the data types
        int i=2;
        Integer ii=new Integer(i);   //This is Object reference of variable'int i' this is 'wrapper class' or 'boxing'
        int j=ii.intValue();         //Assigning Wrapper class variable's value to another variable
        
        int i2=3;
        Integer Num1=i2;    //AutoWrapper or AutoBoxing (first letter of object reference should be in capital 'Pascal case')
        int k = Num1;
        
        System.out.println(j);
        System.out.println(k);  
        
        /*
        output:
        2
        2
         */
        
        //                            wrapper class in "String" data
        
        String name1="Raja";
        String sr=new String(name1);  // Wrapper or Boxing
        String sr2= name1;
        
        
        String Name=name1;    //AutoWrapper or AutoBoxing (first letter should be in capital is Pascal case)
        String name2 = Name;
        

        // parseInt(); only applicable when string value is integer eg."123"
        String str="123";
        int m=Integer.parseInt(str);  //"Integer.parseInt(str)" is used to convert 'string value' into 'Integer value'

        System.out.println(name2);
        System.out.println(str); 
        System.out.println(sr2);  



        /*
        output:
        Raja
        123
        Raja
         */

        //                       practicing program "Wrapper Class and Autoboxing" in "Integer" data

        int a=5;
        Integer aa=new Integer(a);   //wrapper or boxing
        int c=aa.intValue();         //Assigning Wrapper class variable's value to another variable
        int d=a;

        Integer Num2=a;     //AutoWrapper or AutoBoxing
        int b=Num2;

        System.out.println(a);
        System.out.println(c);
        System.out.println(d);

        /*
        output:
        5
        5
        5
         */
    }
}
