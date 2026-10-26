package com.thread;

public class NumbersThread extends Thread {
	
	public static void  numberThread() {
		
		for(int i=0;i<=10;i++)
		{
			if(i % 2==0)
			{
				System.out.println(i);
			}
		}
	}
	
	
	public static void AlphabetThread() {
		
		for(char i='A';i<='E';i++)
		{
			System.out.println(i);
		}
	}
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName().equals("Manisha"));
		 numberThread();
		 
		 AlphabetThread();
		
	}
	
	
	public static void main(String[] args) {
		NumbersThread n=new NumbersThread();
		n.setName("Manisha");
		n.start();
		
		NumbersThread n1=new NumbersThread();
		
	
		n1.start();
		
		
	}

}
