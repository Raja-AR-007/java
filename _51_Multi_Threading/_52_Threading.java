//package com.Concepts.Multi_Threading;

//                                    "Thread" Must watch the Output
// we can rub each Methods Parallel.
/*
class Hi extends Thread{  //open Declaration of 'Thread'
	// if we create start() Method in Object creating area. 
	// we should create a run() Method in all Class
	public void run() {  
		for(int i=1; i<=5;i++) {
			System.out.println("Hi");
			try { Thread.sleep(1000);} catch(Exception e) {}  //it will take one second to print each values 
		}
	}
} 
class Hello extends Thread{
	public void  run() {  // instead of creating a method() we can use run()
		for (int i=1; i<=5; i++) {
			System.out.println("Hello");
			try { Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}
public class Multi_Threading {
	public static void main(String args[]) {
		Hi obj1=new Hi();
		Hello obj2= new Hello();

		obj1.start();  //This start() Method belongs to "Thread class"
		
		obj2.start();  // start() method will call run() method
		
	}
}*/

/*
output:
Hi
Hello
Hello
Hi
Hello
Hi
Hello
Hi
Hello
Hi
 */

//                                     "Thread" Must watch the Output
//we can run each Methods of Class Parallel at the same time.

class Hi extends Thread{  //open Declaration of 'Thread'
	// if we create start() Method in Object creating area. 
	// we should create a run() Method in all Class
	public void run() {  
		for(int i=1; i<=5;i++) {
			System.out.println("Hi");
			try { Thread.sleep(1000);} catch(Exception e) {}  //it will take one second to print each values 
		}
	}
} 
class Hello extends Thread{
	public void  run() {  // instead of creating a method() we can use run()
		for (int i=1; i<=5; i++) {
			System.out.println("Hello");
			try { Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}
public class _52_Threading {
	public static void main(String args[]) {
		Hi obj1=new Hi();
		Hello obj2= new Hello();

		obj1.start();  //This start() Method belongs to "Thread class"
		try { Thread.sleep(100);} catch(Exception e) {}  // Must Watch the output
		obj2.start();  // start() method will call run() method
		
	}
}

/*
output:
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
 */

