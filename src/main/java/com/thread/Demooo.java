package com.thread;

public class Demooo extends Thread {
	
//	public void run() {
//		
//		for(int i=0;i<=5;i++)
//		{
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
	
	
	public void run() {
		for(int i=5;i>=1;i--)
		{
			System.out.println(i);
			try {
				Thread.sleep(2200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		Demooo d=new Demooo();
		d.start();
	}

}
