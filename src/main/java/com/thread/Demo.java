package com.thread;

public class Demo extends Thread {
	
	
	public void run() {
		
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Demo d=new Demo();
		d.setName("Manisha"+Thread.currentThread().getName().equals("Manisha"));
		d.start();
		
		Demo d1=new Demo();
		
		d1.start(); 
		
		Demo d3=new Demo();
		
		d3.setName("Pratiksha");
		d3.start();
		
	}

}
