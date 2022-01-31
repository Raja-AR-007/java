


//	class Printer{
//	    public void show(Integer i){
//	        System.out.println(i);
//	    }
//	}
//	
//	public class _33_Abstract_Class_Why_We_Need {
//	    public static void main(String args[]) {
//	        Printer obj1=new Printer();
//	        obj1.show(5);
//	    }
//	}

/*
output:
5
 */

//                                   Number 
// Number is a Abstract class.
// Open Number's Declaration (f3).

class Printer{
    public void show(Number i){  // Number  ("Number" have all method of "int, float, double" data types)
        System.out.println(i);
    }
}
public class _33_Abstract_Class_Why_We_Need {
    public static void main(String args[]) {
        float f;
        Printer obj1=new Printer();
        obj1.show(5.6f);
        obj1.show(3.6);
        obj1.show(9);
    }
}

/*
output:
5.6  // float value
3.6  // double value
9    // integer value
 */
