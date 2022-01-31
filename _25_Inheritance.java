package com.Concepts;

//                              Normal Class

//	class Operation{
//	    public int add(int a, int b){
//	        return a+b;
//	    }
//	}
//	class AdvOperation{
//	    public int sub(int a, int b){
//	        return a-b;
//	    }
//	}
//	class VeryAdvOperation{
//	    public int mul(int a, int b){
//	        return a*b;
//	    }
//	}
//	public class _25_Inheritance {
//	    public static void main(String[] args){
//	        Operation c1=new Operation();
//	        int result1=c1.add(5,7);
//	        AdvOperation c2=new AdvOperation();
//	        int result2=c2.sub(9,5);
//	        VeryAdvOperation c3=new VeryAdvOperation();
//	        int result3=c3.mul(9,5);
//	        System.out.println(result1);
//	        System.out.println(result2);
//	        System.out.println(result3);
//	    }
//	}

/*
output:
12
4
45
 */

/**********************************************************************************************************************/

//                               Single Inheritance class

//	class Operation{   //Super class or Parent class
//	    public int add(int a, int b){
//	        return a+b;
//	    }
//	}
//	class AdvaOperation extends Operation{   //Derived class or Child Class
//	    public int sub(int a, int b){
//	        return a-b;
//	    }
//	}
//	public class _25_Inheritance {
//	    public static void main(String[] args) {
//	        
//	    	AdvaOperation c2=new AdvaOperation();
//	        int result1=c2.add(2,6);
//	        int result2=c2.sub(5,3);
//	
//	        System.out.println(result1);
//	        System.out.println(result2);
//	    }
//	}

/*
output:
8
2
 */

/**********************************************************************************************************************/


//                               Multiple or Multilevel Inheritance class
// It means Inheriting or extends already Inherited or extended class.
// we will not use this "Multiple or Multilevel Inheritance class" in Java. instead of this we can use "Interface".

//	class Operation{   //Grand Parent Class
//	    public int add(int a, int b){
//	        return a+b;
//	    }
//	}
//	class AdvOperation extends Operation{   //Parent Class
//	    public int sub(int a, int b){
//	        return a-b;
//	    }
//	}
//	class VeryAdvOperation extends AdvOperation{   //Child Class
//	    public int mul(int a, int b){
//	        return a*b;
//	    }
//	}
//	public class _25_Inheritance {
//	    public static void main(String[] args) {
//	        VeryAdvOperation c3 = new VeryAdvOperation();
//	        int result1 = c3.add(5, 7);
//	        int result2 = c3.sub(9, 5);
//	        int result3 = c3.mul(9, 5);
//	        System.out.println(result1);
//	        System.out.println(result2);
//	        System.out.println(result3);
//	    }
//	}

/*
output:
12
4
45
 */

/**********************************************************************************************************************/

//                                Inner Class
/*
class Operation{
    public int add(int a, int b){
        return a+b;
    }
    class AdvOperation{
        public int sub(int a, int b){
            return a-b;
        }
    }
}
public class _25_Inheritance {
   public static void main(String[] args){
       Operation c1=new Operation();
       int result1=c1.add(5,7);

       Operation.AdvOperation c2=c1.new AdvOperation();
       int result2=c2.sub(8,7);

       System.out.println(result1);
       System.out.println(result2);
   }
}*/

/*
output:
12
1
 */

