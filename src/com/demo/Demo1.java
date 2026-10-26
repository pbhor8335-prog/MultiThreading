package com.demo;

public class Demo1 extends Thread{
	
	
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(i +" :"+Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		
		Demo1 d=new Demo1();
		d.setName("Pratiksha");
		d.start();
		
		Demo1 d1=new Demo1();
		
		d1.setName("Manisha");
		d1.start();
	}

}
