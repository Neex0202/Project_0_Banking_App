package com.revature.Project_0;

import java.util.Scanner;

public class Main extends Options{

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Hello! Welcome to Revature Bank!");
		
		home();
		
		//End of main
	}
	
	
	static void home() {
		System.out.println("What would you like to do today? "
				+ "Please choose an option \n"
				+ "1. Create an Account \n"
				+ "2. Log In \n"
				+ "3. Log Out \n");
		String option = scan.nextLine();
		
		switch(option) {
		case "1": 
//			function for create an account;
			createAccount();
//			System.out.println("CREATE ACCOUNT");
			break;
		case "2":
//			function to login
			System.out.println("LOG IN");
			break;
		case "3":
//			function to logout
			System.out.println("LOG OUT");
			break;
			default:
				System.out.println("PLEASE CHOOSE AN OPTION");
				home();
				
				
		}
	}
	
	//End of class
}
