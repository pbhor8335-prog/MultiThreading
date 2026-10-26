package com.demo;

public class Sum extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum is :"+sum);
	}
	
	public static void main(String[] args) {
		Sum s=new Sum();
		s.start();
	}

}
