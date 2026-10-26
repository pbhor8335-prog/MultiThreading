package com.Assignment;

public class Demo extends Thread{
	
@Override
public void run() {
	// TODO Auto-generated method stub
	super.run();
	
	for(int i=1;i<=20;i++)
	{
		System.out.println(i);
	}
}

public static void main(String[] args) {
	
	Demo d=new Demo();
	d.start();
}

}
