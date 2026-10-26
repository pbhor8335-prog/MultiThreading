package com.Assignment;

public class DownloadThread extends Thread {
	@Override
	public void run() {
	
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Downloading  .."+i*20+" %");
		}
		try {
		Thread.sleep(800);
		}catch(Exception e)
		{
//			System.out.println();
			e.printStackTrace();
		}
	}

}
