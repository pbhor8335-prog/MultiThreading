package com.thread;

public class Demo4 extends Thread{
	
	public void run() {
		
		String name=Thread.currentThread().getName();
		
		if(name.equals("odd number"))
		{
			for(int i=0;i<=20;i++)
			{
				if( i % 2 !=0)
				{
					System.out.println(name+":"+i);
				}
			}
		}
		
//		System.out.println();
		
		if(name.equals("Even Number"))
		{
			for(int i=0;i<=20;i++)
			{
				if(i % 2==0)
				{
					System.out.println(name+":"+i);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Demo4 q=new Demo4();
		
		q.setName("odd number");
		q.start();
		
		Demo4 w=new Demo4();
		
		w.setName("Even Number");
		
		w.start();
	}

}
