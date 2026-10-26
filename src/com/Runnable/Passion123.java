package com.Runnable;

public class Passion123 implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i +" :"+Thread.currentThread().getName());
			try {
			Thread.sleep(2000);
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	public static void main(String[] args) {
		Passion123 pp=new Passion123();
		
		Thread t2=new Thread(pp);
		
		t2.start();
		
		
		Thread t3=new Thread(pp);
		
		t3.start();
		
		
		
		
		
		
	}

}
