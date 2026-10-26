package com.demo;

public class LetterThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(char ch='A'; ch<='E';ch++)
		{
			System.out.println(ch);
		}
		
	}
	
	public static void main(String[] args) {
		
		NumberThread nt=new NumberThread();
		nt.start();
		
		
		LetterThread lt=new LetterThread();
		lt.start();
		
	
	}

}
