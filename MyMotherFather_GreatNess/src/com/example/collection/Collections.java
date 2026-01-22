package com.example.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import com.example.multithreading.MultiThreadClass;

public class Collections {
	
	public void startCollections() {
		
		System.out.println("In Collections");
		
		listOfArray();
		linkedList();
		hashMap();
		
		//goto multithreading class
		MultiThreadClass multiThreadClass = new MultiThreadClass();
		multiThreadClass.startMultiThreading();
	}
	
	private void listOfArray() {
		
		System.out.println("In ArrayList");
		
		ArrayList <String> persons = new ArrayList<>();
		persons.add("Audumb");
		persons.add("Nalav");
		System.out.println(persons.size());
	}
	
	public void linkedList() {
		
		System.out.println("In linkedList");
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("A");
		System.out.println(linkedlist.size());
		
	}
	
	private void hashMap() {
		
		System.out.println("In hashmap");

		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("India", "Pune");
		System.out.println(hashMap.size());
	}

}
