package com.example.multithreading;

public class ThreadOutput  extends Thread {
   
	private String person;

	ThreadOutput(String person) {
        this.person = person;
    }

    public void run() {
        System.out.println(person + " is being prepared by " +
            Thread.currentThread().getName());
    }
}
