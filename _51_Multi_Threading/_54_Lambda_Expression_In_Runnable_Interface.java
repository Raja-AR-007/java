//package com.Concepts.Multi_Threading;
                                 
//                                        Runnable Interface in Thread
/*
class See implements Runnable{  //open Declaration of 'Runnable'
	// if we create start() Method in Object creating area. 
	// we should create a run() Method in all Class
	public void run() {  
		for(int i=1; i<=5;i++) {
			System.out.println("see");
			try { Thread.sleep(1000);} catch(Exception e) {}  //it will take one second to print each values 
		}
	}
} 
class You implements Runnable{
	public void  run() {  // instead of creating some method() we can use run()
		for (int i=1; i<=5; i++) {
			System.out.println("you");
			try { Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}
public class _54_Lambda_Expression_In_Runnable_Interface {
	public static void main(String args[]) {
		Runnable obj1=new See();
		Runnable obj2= new You();
		
		Thread t1=new Thread(obj1);  //create 'Good object reference' within the parameter
		Thread t2=new Thread(obj2);  //create 'Bye object reference' within the parameter
		
		t1.start();  //This start() Method belongs to "Thread class"
		try { Thread.sleep(100);} catch(Exception e) {}  // Must Watch the output
		t2.start();  // start() method will call run() method
		
	}
}*/

//                                         Anonymous Class in Runnable Interface
/*
public class _54_Lambda_Expression_In_Runnable_Interface {
	public static void main(String args[]) {
		Runnable obj1=new Runnable() {
			public void run() {  
				for(int i=1; i<=5;i++) {
					System.out.println("see");
					try { Thread.sleep(1000);} catch(Exception e) {}  //it will take one second to print each values 
				}
			}
		};
		Runnable obj2= new Runnable() {
			public void  run() {  // instead of creating some method() we can use run()
				for (int i=1; i<=5; i++) {
					System.out.println("you");
					try { Thread.sleep(1000);} catch(Exception e) {}
				}
			}
		};
		
		Thread t1=new Thread(obj1);  //create 'Good object reference' within the parameter
		Thread t2=new Thread(obj2);  //create 'Bye object reference' within the parameter
		
		t1.start();  //This start() Method belongs to "Thread class"
		try { Thread.sleep(100);} catch(Exception e) {}  // Must Watch the output
		t2.start();  // start() method will call run() method
	}
}*/

//                                       Lambda Expression in Runnable Interface
/*
public class _54_Lambda_Expression_In_Runnable_Interface {
	public static void main(String args[]) {
		Runnable obj1=() ->
						{  
							for(int i=1; i<=5;i++) {
								System.out.println("see");
								try { Thread.sleep(1000);} catch(Exception e) {}  //it will take one second to print each values 
							}
						};
		Runnable obj2= () ->
				{  
					for (int i=1; i<=5; i++) {
						System.out.println("you");
						try { Thread.sleep(1000);} catch(Exception e) {}
					}
			    };
		
		Thread t1=new Thread(obj1);  //create 'Good object reference' within the parameter
		Thread t2=new Thread(obj2);  //create 'Bye object reference' within the parameter
		
		t1.start();  //This start() Method belongs to "Thread class"
		try { Thread.sleep(100);} catch(Exception e) {}  // Must Watch the output
		t2.start();  // start() method will call run() method
	}
}*/

//                                         Lambda Expression in Runnable Interface
//                              putting whole Runnable Method within the 'Thread Object parameter'

public class _54_Lambda_Expression_In_Runnable_Interface {
	public static void main(String args[]) { 	
		Thread t1=new Thread(() ->
		{  
			for(int i=1; i<=5;i++) {
				System.out.println("see");
				try { Thread.sleep(1000);} catch(Exception e) {}  //it will take one second to print each values 
			}
		});  // putting whole method within the parameter
		Thread t2=new Thread(() ->
		{  
			for (int i=1; i<=5; i++) {
				System.out.println("you");
				try { Thread.sleep(1000);} catch(Exception e) {}
			}
	    });  // putting whole method within the parameter
		
		t1.start();  //This start() Method belongs to "Thread class"
		try { Thread.sleep(100);} catch(Exception e) {}  // Must Watch the output
		t2.start();  // start() method will call run() method
	}
}

/*
output:  // All Programs have same Output
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
*/
