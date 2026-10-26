package com.thread;

public class Front extends Thread{
	
	public void run()
	{
		System.out.println("Hello");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Pratiksha");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thank You!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Front f=new Front();
		f.start();
		
		Front f1=new Front();
		f1.start();
		
		Front f2=new Front();
		f2.start();
		
		Front f3=new Front();
		f3.start();
	}

}
