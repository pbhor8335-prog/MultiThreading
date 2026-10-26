package com.thread;

public class Funn extends Thread{
	
	public void run() {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(" 2 *"+i+"="+(2*i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Funn f=new Funn();
		f.start();
	}

}
