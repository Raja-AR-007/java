package com.Concepts;

public class _22_Array_1D_2D_Jagged_Enhance_for_Loop {
    public static void main(String[] args) {
    	
// Array is a container which will contain index position of a value

//                                        One  Dimension Array
        
//        int num[]=new int[4];
//        num[0]=14;
//        num[1]=23;
//        num[2]=32;
//        num[3]=41;
//        num[0]=3;
//        for(int i=0; i<=4; i++){
//            System.out.println(num[i]);
//        }   

        /*
        output:
        3
        23
        32
        41
         */


//        int num1[]={14, 23, 32, 41};
//        num1[0]=3;                     //index of 0th position is changed
//        for(int i=0; i<=3; i++){
//            System.out.println(num1[i]);
//        }

        /*
        output:
        3
        23
        32
        41
         */

//                                          Enhanced for Loop (or) for Each Loop
//                                       'Enhanced for Loop' in One Dimension Array

// It will print only forward not backward but Normal for loop can do both
        
//        int num[]={14, 23, 32, 41};
//        for(int k:num){   //Enhanced for Loop (or) for Each Loop
//            System.out.println(k);
//        }  

        /*
        output:
        14
        23
        32
        41
         */

//                                            Tow Dimension Array
        
//        int num[][]={
//                        {1,8,3},
//                        {9,5,6},
//                        {6,8,9}
//                     };
//        for(int i=0; i<3; i++) {  // row
//            for (int j=0; j<3; j++) {  //column
//                System.out.print(" " + num[i][j]);
//            }
//            System.out.println();
//        }  

        /*
        output:
        1 8 3
        9 5 6
        6 8 9
        */

//                                    Enhanced for Loop (or) for Each Loop
//                                 'Enhanced for Loop' in Tow Dimension Array
        
//        int num[][]={
//                        {1,8,3},
//                        {9,5,6},
//                        {6,8,9}
//                     };
//        for(int k[]:num){   //Enhanced for Loop (or) for Each Loop
//            for(int l:k){
//                System.out.print(" " + l);
//            }
//            System.out.println();
//        }  

        /*
        output:
        1 8 3
        9 5 6
        6 8 9
        */

//                                                  Jagged Array
// Jagged array only applicable on Two dimension array
        
//        int num[][] = {
//                        {1, 8, 3},     //the size of values will change in each index position
//                        {9, 5},
//                        {6, 8, 9, 7}
//                      };
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                System.out.print(" " + num[i][j]);
//            }
//            System.out.println();
//        }  

        /*
        output:
        1 8 3
        9 5
        6 8 9 7
        */

//                                      Enhanced for Loop (or) for Each Loop
//                                      'Enhanced for Loop' in Jagged Array
        
        int num[][] = {
                        {1, 8, 3},     //the size of values will change in each index position
                        {9, 5},
                        {6, 8, 9, 7}
                      };
        for(int k[]:num){   //Enhanced for Loop (or) for Each Loop
            for(int l:k){
                System.out.print(" " + l);
            }
            System.out.println();
        }  

        /*
        output:
        1 8 3
        9 5
        6 8 9 7
        */
    }
}
