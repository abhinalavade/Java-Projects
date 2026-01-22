package com.example.basic;

import com.example.collection.Collections;

public class BasicThings {
	
	
	public void startBasics() {
		
		strings();
		exceptions();
		
		//go to collections class
		Collections collections = new Collections();
		collections.startCollections();
	}
	
	
	public void strings() {
		System.out.println("In Strings method");
	}
	
	public void exceptions() {
		
		System.out.println("In Exceptions method");
		
		try {
		      int number = 5 / 0;
		    }
		    
		    catch (ArithmeticException e) {
		      System.out.println("ArithmeticException => " + e.getMessage());
		    }
		
		
		try {
		      int name = (Integer) null;
		    }
		    
		    catch (NullPointerException e) {
		      System.out.println("NullPointerException => " + e.getMessage());
		    }

		
	}

}
