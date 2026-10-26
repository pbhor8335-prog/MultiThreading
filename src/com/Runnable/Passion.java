package com.Runnable;

public class Passion  implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Pratiksha :"+Thread.currentThread().getName());
			
			try {
			Thread.sleep(5000);
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Passion p=new Passion();
		
		Thread s=new Thread(p);
		
		s.start();
		
	}

}
