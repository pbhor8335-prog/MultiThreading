package com.thread;

public class Demo5 extends Thread {
	
	public void run() {
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName());
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Demo5 d=new Demo5();
		d.setName("Pratiksha");
		d.start();
		
		Demo5 d1=new Demo5();
		
		d1.setName("Angha");
		
		d1.start();
		
		
	}

}
