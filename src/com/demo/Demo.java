package com.demo;


public class Demo extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("Run Method Are Called   :"+ Thread.currentThread().getName());
			
	}
	
	public static void main(String[] args) {
		Demo d=new Demo();
		d.setName("Pratiksha");
		System.out.println(d.getName());
		d.start();
		
		Demo d1=new Demo();
		d1.setName("Manisha");
		d1.start();
		
		
		Demo d2=new Demo();
		d2.setName("Pushpa");
		d2.start();
		
		
		Demo d3=new Demo();
		d3.setName("Namrata");
		d3.start();
	}
	

}
