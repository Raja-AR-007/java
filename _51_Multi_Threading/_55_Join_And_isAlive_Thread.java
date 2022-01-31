//package com.Concepts.Multi_Threading;


// By using 'Anonymous Class' we can avoid 'sub Classes'. See and You sub Classes are avoided.

public class _55_Join_And_isAlive_Thread {
	//                                            creating Thread for main Method
	/*
	public static void main(String args[]) throws Exception {  //for main Thread
		
		Thread t1=new Thread(new Runnable() {  //Anonymous Class
			public void run() {  
				for(int i=1; i<=5;i++) {
					System.out.println("see");
					try { Thread.sleep(1000);} catch(Exception e) {}  //it will take one second to print each values 
				}
			}
		});  //create 'object reference' within the parameter
		Thread t2=new Thread(new Runnable() {   //Anonymous Class
			public void  run() {  // instead of creating some method() we should run() in Thread
				for (int i=1; i<=5; i++) {
					System.out.println("you");
					try { Thread.sleep(1000);} catch(Exception e) {}
				}
			}
		});  //create 'object reference' within the parameter
		
		t1.start();  
		try { Thread.sleep(100);} catch(Exception e) {}  // Must Watch the output
		t2.start(); 
		
		System.out.println("Bye");  // creating Thread for main Method
	}*/

	/*
	output:
	see
	Bye  // here 'Bye main Thread' is between see and you. this not proper Join Thread
	you
	see
	you
	see
	you
	see
	you
	see
	you
	 */

//                                                Join Thread

// By using join we can add extra 'new Thread'.
// 'join() Thread' is used to wait a 'new Thread' to execute. until when previous Threads get executed.
// if we used join() Method, we should 'throws Exception' on Method.

// By using 'Anonymous Class' we can avoid 'sub Classes'. (See and Your sub Classes are avoided).

	
	public static void main(String args[]) throws Exception {  // for main Thread
		
		Thread t1=new Thread(new Runnable() {  //Anonymous Class
				public void run() {  
					for(int i=1; i<=5;i++) {
						System.out.println("see");
						try { Thread.sleep(1000);} catch(Exception e) {}  //it will take one second to print each values 
					}
				}
			});  //create 'Good object reference' within the parameter
		Thread t2=new Thread(new Runnable() {   //Anonymous Class
				public void  run() {  // instead of creating some method() we should run() in Thread
					for (int i=1; i<=5; i++) {
						System.out.println("you");
						try { Thread.sleep(1000);} catch(Exception e) {}
					}
				}
			});  //create 'Bye object reference' within the parameter
		
		t1.start();  
		try { Thread.sleep(100);} catch(Exception e) {}  // Must Watch the output
		t2.start(); 
		
		t1.join();  //Join Thread (main Thread will wait until When previous Thread get executed)
		t2.join();  //Join Thread
		
		try { Thread.sleep(500);} catch(Exception e) {}
		System.out.println("Bye");  // this belongs to main Thread. new Thread created by join() Method
	}

	/*
	output:
	see
	you
	see
	you
	see
	you
	see
	you
	see
	you
	Bye  //Join Thread (main thread)
 */
//                                        isAlive() Thread

// 'isAlive Thread' is used to check a Thread is running (true) or not (false).  
// By using 'Anonymous Class' we can avoid 'sub Classes'. See and You sub Classes are avoided.

// Refer Runnable Interface (if have any doubt)
	/*
	public static void main(String args[]) throws Exception {  // for main Thread
		
		Thread t1=new Thread(new Runnable() {  //Anonymous Class
			public void run() {  
				for(int i=1; i<=5;i++) {
				System.out.println("see");
				try { Thread.sleep(1000);} catch(Exception e) {}  //it will take one second to print each values 
				}
			}
		});  //create 'Good object reference' within the parameter
		Thread t2=new Thread(new Runnable() {   //Anonymous Class
			public void  run() {  
				for (int i=1; i<=5; i++) {
				System.out.println("you");
				try { Thread.sleep(1000);} catch(Exception e) {}
				}
			}
		});  //create 'Bye object reference' within the parameter
	
		t1.start();  // calling run() Method
		try { Thread.sleep(100);} catch(Exception e) {}  
		t2.start(); 
		
		System.out.println(t1.isAlive());  // isAlive() Thread Before t1,t2 'True'
		
		t1.join();  //Join Thread (main Thread will wait until When previous Thread get executed)
		t2.join();  //Join Thread
		
		System.out.println(t1.isAlive());  // isAlive() Thread After t1,t2 'False'
		
		try { Thread.sleep(500);} catch(Exception e) {}
		System.out.println("Bye");  // this belongs to main Thread. new Thread created by join() Method
	}*/
	
	/*
	output:
	see
	true  // isAlive Thread 'true means Thread running'
	you
	see
	you
	see
	you
	see
	you
	see
	you
	false  // isAlive Thread 'false means Thread not running'
	Bye  //Join Thread
	 */
}




