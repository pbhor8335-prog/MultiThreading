package com.Assignment;

public class StarPAttern  extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		StarPAttern sp=new StarPAttern();
		
		sp.start();
	}

}
