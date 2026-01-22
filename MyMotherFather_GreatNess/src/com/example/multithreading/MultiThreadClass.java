package com.example.multithreading;

public class MultiThreadClass {
	
	public void startMultiThreading() {
		
		System.out.println("In MultiThreading");
		
		step1Threading();
	}

	private void step1Threading() {
		
		 	Thread t1 = new ThreadOutput("Audumb");
	        Thread t2 = new ThreadOutput("Surekha");

	        t1.start();
	        t2.start();
		
	}
}
