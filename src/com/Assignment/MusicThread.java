package com.Assignment;

public class MusicThread extends Thread {
	@Override
	public void run() {
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("Music Playing :"+i);
		}
		try {
		
		Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
