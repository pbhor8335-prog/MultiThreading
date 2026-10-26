package com.Runnable;

public class Even implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=2;i<=10;i=i+2)
		{
			System.out.println(i);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Even e=new Even();
		Thread t=new Thread(e);
		
		t.start();
		
	}

}
