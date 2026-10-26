package com.thread;

public class Demo3 extends Thread{
	
	public void run() {
		
		String name=Thread.currentThread().getName();
		
		if(name.equals("forward"))
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		if(name.equals("Backward"))
		{
			for(int i=5;i>=1;i--)
			{
				System.out.println(i);
			}
		}
		
		System.out.println();
		if(name.equals("Pratiksha"))
		{
			for(int i=1;i<=5;i++)
			{
				if(i %2 ==0)
				{
					System.out.println(i);
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		Demo3 d=new Demo3();
		
		d.setName("forward");
		
		d.start();
		
		Demo3 d1=new Demo3();
		
		d1.setName("Backward");
		
		d1.start();
		
//		Demo4 f=new Demo4();
		
		Demo3 e1=new Demo3();
		
		e1.setName("Pratiksha");
		
		e1.start();
	}

}
