package com.Assignment;

public class Demo123 extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch);
		}
	}
	
	public static void main(String[] args) {
		Demo123 d1= new Demo123();
		d1.start();
	}
	

}
