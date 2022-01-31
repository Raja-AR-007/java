//package com.Concepts;
import java.util.Scanner;

public class _8_Basic_Programs {
    public static void main(String[] args) {


        //                     Operators
        
//        int a, b;
//
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter a value for a :");
//        a =input.nextInt();
//        System.out.println("Enter a value for b :");
//        b =input.nextInt();
//
//        int c1=a+b;
//        int c2=a-b;
//        int c3=a*b;
//        double c4=(double)a/b; //casting convention
//        int c5=a%b;
//
//        System.out.println("Additon :"+c1);
//        System.out.println("Subraction :"+c2);
//        System.out.println("Multiplication :"+c3);
//        System.out.println("Divition :"+c4);
//        System.out.println("Percentage :"+c5); 
    /*
    output:
    Enter a value for a :
    2
    Enter a value for b :
    5
    Additon :7
    Subraction :-3
    Multiplication :10
    Divition :0.4
    Percentage :2
    */

        //                    Implicit convention

        
//        double d=55;     // Implicit convention
//        System.out.println(d);  
    /*
    output:
    55.0
     */
        //                condition (if else)
        //               Odd or Even Number Program
        
//        int a;
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter a Number :");
//        a =input.nextInt();
//        if(a==0) {   //more than one statement we should have mention {}
//            System.out.println("nothing");
//        }
//
//        else if(a%2 == 0) {
//            System.out.println("Even number");
//        }
//            else {
//            System.out.println("Odd number");
//        }
    /*
    output:
    Enter a Number :
    4
    Even number
    8
     */


        //                         Switch
        
//        int a;
//        
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter your roll number :");
//        a=s.nextInt();
//        
//        switch(a) {
//            case 1:
//                System.out.println("you are in");
//                break;
//            case 2:
//                System.out.println("you are in");
//                break;
//            case 3:
//                System.out.println("you are in");
//                break;
//            default:
//                System.out.println("you are out");
//                break;
//            }
    /*
    output:
    you are out
     */

        //                       other way for (Switch)
        /*
       int a=3;

        if(a==1) {
            System.out.println("one");
        }
        else if(a==2) {
            System.out.println("two");
        }
        else if(a==3) {
            System.out.println("three");
        }
        else if(a==4) {
            System.out.println("four");
        }
        else {
            System.out.println("out of number");
        }*/
    /*
    output:
    three
     */

        //                          loop
        //                      while loop
        /*
        int a=1;
        while(a<=4){
            System.out.println("hello");
            a++;
        }*/
    /*
    output:
    hello
    hello
    hello
    hello
     */

        //                      do while loop
        /*
        int a=9;
        do{
            System.out.println("hello");
            a++;
        }while(a<=8);*/
     /*
     output:
     hello
     */

        //                         for loop
        /*
        for(int a=1; a<=4; a++ ){
            System.out.println("hello");
        }*/
    /*
    output:
    hello
    hello
    hello
    hello
     */

        //                     Nested for loop
        /*
        for(int b=1; b<=4; b++) {          //column wise
            for (int a = 1; a <= 4; a++) {     //row wise
                System.out.print(a + " ");
            }
            System.out.println();
        }*/
    /*
    output :
    1 2 3 4
    1 2 3 4
    1 2 3 4
    1 2 3 4
     */

    //                     Break , Continue (1:18:40)
    //                          Continue
        
//        for(int i=1; i<=5; i++) {
//            if (i < 3) {
//                continue; // continue will skip the condition part
//            }             // and it'll print remaining part
//            System.out.println("Value is :" + i);
//        }
    /*
    output:
    Value is :3
    Value is :4
    Value is :5
    */

        //                          Break
        
        for(int i=1; i<=5; i++){
            if(i==3){
                break; // break will print only the particular part and
            }          //it will skip the remaining part (based on the condition)
            System.out.println("Value is :"+i);
        }
    /*
    output :
    Value is :1
    Value is :2
    */


    }
}
