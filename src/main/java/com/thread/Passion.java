package com.thread;

public class Passion extends Thread{
	
	public void run() {
		
		String name=Thread.currentThread().getName();
		
		if(name.equals("AdditionThread"))
		{
			int sum=0;
			for(int i=1;i<=5;i++)
			{
				
				
				sum=sum+i;
				
			}
			System.out.println("Sum :"+sum);

		}
		
		if(name.equals("MultThread"))
		{
			int product=1;
			for(int i=1;i<=5;i++)
			{
				
				
				product=product*i;
				
			}
			
			System.out.println("Product :"+product);

		}	
	}
	
	public static void main(String[] args) {
		Passion p=new Passion();
		p.setName("AdditionThread");
		p.start();
		
		Passion p1=new Passion();
		p1.setName("MultThread");
		p1.start();
		
	}

}
