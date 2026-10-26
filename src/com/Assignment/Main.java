package com.Assignment;

public class Main {
	
	public static void main(String[] args) {
		
		MusicThread m=new MusicThread();
		
		DownloadThread d=new DownloadThread();
		
		NotificationThread n=new NotificationThread();
		
		m.start();
		d.start();
		n.start();
		
	}

}
