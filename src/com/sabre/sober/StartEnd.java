package com.sabre.sober;

public class StartEnd implements Runnable{

	public StartEnd(String name){
		this.str = name;
	}
	Thread t = null;
	String str = "default value";
	public static void main(String[] args) {
		StartEnd st = new StartEnd("A");		
		StartEnd st1 = new StartEnd("B");
		st1.start();
		st.start();
	}

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public void start(){
		
		if(t == null){
			t = new Thread(this, this.str);
			
		}
		t.start();
		
	}

}
