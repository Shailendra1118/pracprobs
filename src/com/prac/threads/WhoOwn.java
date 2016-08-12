package com.prac.threads;

public class WhoOwn {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				WhoOwn obj = new WhoOwn();
				synchronized (obj) {
					System.out.println(Thread.holdsLock(obj));
				}
				System.out.println("T1");
			}
			
		});
		
		t1.start();
		System.out.println("Ends"+Thread.currentThread());
		
	}

}
