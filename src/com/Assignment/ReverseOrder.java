package com.Assignment;

public class ReverseOrder extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ReverseOrder st=new ReverseOrder();
		
		st.start();
	}

}
