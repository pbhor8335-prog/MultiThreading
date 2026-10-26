package com.demo;

public class Passion extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Pratiksha");
		}
	}
	
	public static void main(String[] args) {
		Passion p=new Passion();
		p.start();
	}

}
