package com.practice;

public class Demo extends Thread{
	
	public void run() {
		
		String name=Thread.currentThread().getName();
		
		if(name.equals("FactorialThread"))
		{
			int fact=1;
			
			for(int i=1;i<=5;i++)
			{
				fact=fact*i;
			}
			
			System.out.println("Factorial :"+fact);
		}
		
		if(name.equals("SqaureThread"))
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Square :"+(i*i));
			}
		}
		
		if(name.equals("CubeThread"))
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("cube :"+(i*i*i));
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.setName("FactorialThread");
		d.start();
		
		
		Demo d1=new Demo();
		
		d1.setName("SqaureThread");
		d1.start();
		
		Demo d2=new Demo();
		d2.setName("CubeThread");
		d2.start();
	}
	
	

}
