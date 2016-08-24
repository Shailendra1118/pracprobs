package com.prac.threads;

public class TestThreads {

	public static void main(String[] args) {
		Test t = new Test();
		t.start();
		
		Test t1 = new Test();
		t1.start();
		
		Test t2 = new Test();
		t2.start();
		
		try {
			synchronized(t){
				System.out.println("t waiting....");
				t.wait();
				System.out.println("t after wait..");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			synchronized(t1){
				System.out.println("t1 waiting....");
				t1.wait();
				System.out.println("t1 after wait..");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			synchronized(t2){
				System.out.println("t2 waiting....");
				t2.wait();
				System.out.println("t2 after wait..");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class Test extends Thread{
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("i: "+i);
		}
		synchronized(this){
			this.notify();
		}
	}
}
