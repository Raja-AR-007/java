//package com.Concepts.Multi_Threading;

/*
class Counter{
	
	int count;
	
	public void increment() {
		count++;
	}
}
public class _57_Thread_Synchornized_Keyword {

	public static void main(String[] args) {
		Counter c=new Counter();
		c.increment();
		c.increment();
		
		System.out.println("Count " + c.count);
	}
}*/

/*
output:
Count 2
 */

/*
class Counter{
	
	int count;
	
	public void increment() {
		count++;
	}
}
public class _57_Thread_Synchornized_Keyword {

	public static void main(String[] args) {
		
		Counter c=new Counter();
		
		Thread t1=new Thread(new Runnable() {
					public void run() {
						for(int i=1; i<=1000; i++) {
							c.increment();
						}
					}
			});
		
		t1.start();
		
		System.out.println("Count "+ c.count);
	}
}*/

/*
output:
Count 0
*/

// if we used join() we should 'throws Exception' on Method.
/*
class Counter{
	
	int count;
	
	public void increment() {
		count++;
	}
}
public class _57_Thread_Synchornized_Keyword {

	public static void main(String[] args) throws Exception {
		
		Counter c=new Counter();
		
		Thread t1=new Thread(new Runnable() {
					public void run() {
						for(int i=1; i<=1000; i++) {
							c.increment();
						}
					}
			});
		
		t1.start();
		
		t1.join();
		
		System.out.println("Count "+ c.count);	// new Thread created by join() Method	
	}
}*/

/*
output:
Count 1000
 */

//                                        Synchronized keyword

// 'Synchronized keyword' will use in Method.
// In 'Synchronized Method' Only one Thread can work or access with this Method.
// other Threads should wait until the previous thread get executed.

class Counter{
	
	int count;
	// Both Thread accessing this Method at the same time will create issue
	public synchronized void increment() {  // Synchronized keyword
		count++;  // count = count + 1
	}
}
public class _57_Thread_Synchornized_Keyword {

	public static void main(String[] args) throws Exception {
		
		Counter c=new Counter();
		
		Thread t1=new Thread(new Runnable() {
					public void run() {
						for(int i=1; i<=1000; i++) {
							c.increment();
						}
					}
			});
		Thread t2=new Thread(new Runnable() {
					public void run() {
						for(int i=1; i<=1000; i++) {
							c.increment();
						}
					}
			});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println("Count "+ c.count);  // new Thread created by join() Method
	}
}
