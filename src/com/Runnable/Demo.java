package com.Runnable;

public class Demo implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(i +" : " +Thread.currentThread().getName());
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		
		Thread t1=new Thread(d);
		
		t1.start();
		
		Thread t2=new Thread(d);
		
		t2.start();
		
		Thread t3=new Thread(d);
		
		t3.start();
		
	}

}
