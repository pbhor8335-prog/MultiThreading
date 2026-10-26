package com.Assignment;

public class NotificationThread extends Thread {
	
	@Override
	public void run() {
		
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Notification Received");
		}
		try {
		Thread.sleep(1800);;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		}

}
