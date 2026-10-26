package com.demo;

public class Numbers extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i=1;i<=100;i++)
		{
			if(i % 3==0 && i % 5==0)
			{
				System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Numbers n=new Numbers();
		
		n.start();
	}

}
