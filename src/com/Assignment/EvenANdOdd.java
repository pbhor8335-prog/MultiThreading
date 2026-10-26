package com.Assignment;

public class EvenANdOdd extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i=1;i<10;i++)
		{
			if(i % 2==0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		for(int j=1;j<=10;j++)
		{
			if(j % 2 !=0)
			{
				System.out.println(j);
			}
		}
		
		System.out.println();
		
		for(int a=1;a<=10;a++)
		{
			System.out.println(7*a);
		}
		
		System.out.println();
		for(int q=1;q<=10;q++)
		{
			System.out.println("Pratiksha");
		}
		
	}
	
	public static void main(String[] args) {
		
		EvenANdOdd eo=new EvenANdOdd();
		eo.start();
		
	}

}
