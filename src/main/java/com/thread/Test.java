package com.thread;

public class Test extends Thread {
	
	public void run() {
		
		String name=Thread.currentThread().getName();
		
		for(int  i=0;i<=5;i++)
		{
			if(name.equals("Hello Thread"))
			{
				System.out.println("Hello");
			}else {
				System.out.println("Welcome");
			}
		}
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		
		t.setName("Hello Thread");
		
		t.start();
		
		Test t1=new Test();
		
		t1.setName("Welcome Thread");
		
		t1.start();
		
		Test t2=new Test();
		
		t2.start();
	}

}
