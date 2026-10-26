package com.thread;

public class Deab extends Thread{
	
	public void run() {
		
		String name=Thread.currentThread().getName();
		
		if(name.equals("PositiveThread"))
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(name+":"+i);
			}
		}
		
		if(name.equals("NegativeThread"))
		{
			for(int i=-1;i>=-5;i++)
			{
				System.out.println(name+":"+i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Deab b=new Deab();
		b.setName("PositiveThread");
		
		b.start();
		
		Deab b1=new Deab();
		b.setName("NegativeThread");
		b1.start();
		
		
	}

}
