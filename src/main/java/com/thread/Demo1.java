package com.thread;

public class Demo1 extends Thread{
	
	
	public void run() {
		
		String name=Thread.currentThread().getName();
		
		if(name.equals("Manisha"))
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(name+":"+i);
			}
		}
		
		if(name.equals("Even Number"))
		{
			for(int i=0;i<=10;i+=2)
				
			{
				System.out.println(name +":"+i);
			}
		}
		
		
			
	}
	
	 public static void main(String[] args) {
//		Demo1 new=Demo1().
		 
		 Demo1 d=new Demo1();
		 d.setName("Manisha");
		 d.start();
		 
		 Demo1 d2=new Demo1();
		 
			 d2.setName("Even Number");
			 
			 d2.start();
	}

}
