package com.demo;

public class NumberThread extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("Numbers :"+i);
		}
	}
	
	

}
