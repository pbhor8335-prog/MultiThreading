package com.thread;

public class Demo2 extends Thread {
	
	public void run() {
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.setName("Hello");
		d.start();
//		d.setName("Manisha");
		
		Demo2 d1=new Demo2();
		
		d1.setName("Manisha");
		d1.start();
		
		Demo2 d3=new Demo2();
		
		d3.start();
	}

}
