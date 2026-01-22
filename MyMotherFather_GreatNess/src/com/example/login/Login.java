package com.example.login;

import com.example.basic.BasicThings;
import com.example.utils.UtilData;

public class Login {
	
	
	public void login() {
		System.out.println("Welcome to Login");
		boolean loginOutput = loginORNot("Audumb","Nalav");
		
		if(loginOutput) {
			System.out.println("Login Successful");
			
			BasicThings basicThings = new BasicThings();
			basicThings.startBasics();
		}
		else {
			System.out.println("Login Failed");
		}
	}
	
	public Boolean loginORNot(String userName, String password) {
		
        UtilData utilData = new UtilData();
        
        if (userName.equals(utilData.userName) && password.equals(utilData.password)) {
        	return true;
        }
        else {
        	return false;
        }
		
	}

}
