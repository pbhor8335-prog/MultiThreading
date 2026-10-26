package com.thread;

public class Table extends Thread{
	
	public void run() {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*2);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		Table t=new Table();
		t.start();
	}

}
