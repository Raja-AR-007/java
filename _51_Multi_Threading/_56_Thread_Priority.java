//package com.Concepts.Multi_Threading;

public class _56_Thread_Priority {
//                                                   Thread Priority
	
// 1 is Low Priority, 5 is Medium Priority, 10 is High Priority.
	/*
	public static void main(String args[]) throws Exception {  // for main Thread

		//create 'object reference' within the Thread parameter
		Thread t1=new Thread(new Runnable() {  
				public void run() {
					for(int i=1; i<=5;i++) {
						System.out.println("dog " + Thread.currentThread().getPriority());
						try { Thread.sleep(1000);} catch(Exception e) {}  //it will take one second to print each values 
					}
				}
			},"dog Thread");  // Naming Thread within Thread object parameter 
		Thread t2=new Thread(new Runnable(){
				public void run() {
					for (int i=1; i<=5; i++) {
						System.out.println("cat " + Thread.currentThread().getPriority());
						try { Thread.sleep(1000);} catch(Exception e) {}
					}
				}
			},"cat Thread");  // Thread(Runnable target, String name) Runnable target is obj1,obj2 and String name is Thread Name

		t1.setPriority(1);  // By using 'setPriority()' we can change the Range
		t2.setPriority(10);
		
		System.out.println(t1.getPriority());  // By default 'getPrority()' have Medium or same range which is 5
		System.out.println(t2.getPriority());
		
		System.out.println(t1.getName());  
		System.out.println(t2.getName());
		
		t1.start();  // calling run() Method
		try { Thread.sleep(100);} catch(Exception e) {}  
		t2.start();  
		
		System.out.println(t1.isAlive());  // isAlive Thread (true)

		t1.join();  //Join Thread
		t2.join();  //Join Thread
		
		System.out.println(t1.isAlive());  // isAlive Thread (false)
		
		try { Thread.sleep(1500);} catch(Exception e) {}  
		System.out.println("Bye");  // this belongs to main Thread. new Thread created by join() Method
	}*/
	
	/*
	output:
	1
	10
	dog Thread
	cat Thread
	dog 1
	cat 10
	true
	dog 1
	cat 10
	dog 1
	cat 10
	dog 1
	cat 10
	dog 1
	cat 10
	false
	Bye
	 */

//                                                       Thread Priority
	
// we can set Priority to a Thread, Which should be high or low or Normal Priority.
// 1 is Low Priority, 5 is Normal Priority, 10 is High Priority.
	
	public static void main(String args[]) throws Exception {  // for main Thread

		//create 'object reference' within the Thread parameter
		Thread t1=new Thread(new Runnable() {  
				public void run() {
					for(int i=1; i<=5;i++) {
						System.out.println("dog " + Thread.currentThread().getPriority());
						try { Thread.sleep(1000);} catch(Exception e) {}  //it will take one second to print each values 
					}
				}
			},"dog Thread");  // Naming Thread within Thread object parameter 
		Thread t2=new Thread(new Runnable(){
				public void run() {
					for (int i=1; i<=5; i++) {
						System.out.println("cat " + Thread.currentThread().getPriority());
						try { Thread.sleep(1000);} catch(Exception e) {}
					}
				}
			},"cat Thread");  // Thread(Runnable target, String name) Runnable target is obj1,obj2 and String name is Thread Name

		t1.setPriority(Thread.MIN_PRIORITY);  // open Declaration of MIN_PRIORITY
		t2.setPriority(Thread.MAX_PRIORITY);  // By using 'setPriority()' we can change the Range
		
		System.out.println(t1.getPriority());  // By default 'getPrority()' have Medium or same range which is 5
		System.out.println(t2.getPriority());
		
		System.out.println(t1.getName());  
		System.out.println(t2.getName());   // Naming a Thread
		
		t1.start();  // calling run() Method
		try { Thread.sleep(100);} catch(Exception e) {}  
		t2.start();  
		
		System.out.println(t1.isAlive());  // isAlive Thread (true)

		t1.join();  //Join Thread
		t2.join();  //Join Thread
		
		System.out.println(t1.isAlive());  // isAlive Thread (false)
		
		try { Thread.sleep(1500);} catch(Exception e) {}  
		System.out.println("Bye");  // this belongs to main Thread. new Thread created by join() Method
	}
	/*
	output:
	1
	10
	dog Thread
	cat Thread
	dog 1
	cat 10
	true
	dog 1
	cat 10
	dog 1
	cat 10
	dog 1
	cat 10
	dog 1
	cat 10
	false
	Bye
	 */
}
