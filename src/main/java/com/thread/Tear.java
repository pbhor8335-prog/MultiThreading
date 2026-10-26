package com.thread;

public class Tear  extends Thread {
	
	public void run() {
		
		String name=Thread.currentThread().getName();
		
		if(name.equals("NumberThread"))
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(name+":"+i);
			}
		}
		
		if(name.equals("AlphabetThread"))
		{
			for(char a='A';a<='E';a++)
			{
				System.out.println(name+":"+a);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Tear t=new Tear();
		
		t.setName("NumberThread");
		
		t.start();
		
		Tear r=new Tear();
		
		r.setName("AlphabetThread");
		r.start();
	}

}
