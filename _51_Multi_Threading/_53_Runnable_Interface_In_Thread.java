//package com.Concepts.Multi_Threading;

//                                      Runnable Interface in Thread

// Runnable Interface is a Functional Interface.In that interface have only one Method. that is run().

class Good implements Runnable{  //open Declaration of 'Runnable'
	// if we create start() Method in Object creating area. 
	// we should create a run() Method in all Class
	public void run() {  
		for(int i=1; i<=5;i++) {
			System.out.println("Good");
			try { Thread.sleep(1000);} catch(Exception e) {}  //it will take one second to print each values 
		}
	}
} 
class Bye implements Runnable{
	public void  run() {  // instead of creating some method() we can use run()
		for (int i=1; i<=5; i++) {
			System.out.println("Bye");
			try { Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}
public class _53_Runnable_Interface_In_Thread  {
	public static void main(String args[])  {
		Runnable obj1=new Good();
		Runnable obj2= new Bye();
		
		Thread t1=new Thread(obj1);  //create 'Good object reference' within the Thread parameter
		Thread t2=new Thread(obj2);  //create 'Bye object reference' within the Thread parameter
		
		t1.start();  //This start() Method belongs to "Thread class"
		try { Thread.sleep(100);} catch(Exception e) {}  // Must Watch the output
		t2.start();  // start() method will call run() method
	}
}

/*
output:
Good
Bye
Good
Bye
Good
Bye
Good
Bye
Good
Bye
 */
