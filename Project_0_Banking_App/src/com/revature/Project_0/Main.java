package com.revature.Project_0;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.revature.Bank.*;
//import com.revature.Project_0.Main.bank;
import com.revature.dao.*;
import com.revature.pojos.BankAccount;
import com.revature.pojos.User;

public class Main{

	static Scanner scan = new Scanner(System.in);
	
	public static Bank bank = new Bank();
	public static BankAccount bankAccount = new BankAccount();
	
	public static void main(String[] args) {
	
		
		home();
		//End of main
	}
	
	
	static void home() {
		System.out.println("What would you like to do today? "
				+ "Please choose an option \n"
				+ "1. Create an Account \n"
				+ "2. Log In \n");
			
		String option = scan.nextLine();
		
		switch(option) {
		case "1": 
//			function for create an account;
			System.out.println("Enter Your first Name \n");
			String firstName = scan.nextLine();
			
			System.out.println("Enter Your Last Name \n");
			String lastName = scan.nextLine();
			
			System.out.println("Enter a username \n");
			String username = scan.nextLine();
			
			System.out.println("Enter a password");
			String password = scan.nextLine();
			
						
			bank.createUser(firstName, lastName, username, password);
			home();
//			System.out.println("CREATE ACCOUNT");
			break;
		case "2":
//			function to login
			
//			System.out.println("Enter your username");
//			String usernameLogIn = scan.nextLine();
//			
//			System.out.println("Enter your password");
//			String passwordLogIn = scan.nextLine();
			
//			if(bank.signIn(usernameLogIn, passwordLogIn)){
//			LoggedInOptions();
//			}
			
			if(bank.signIn("nf", "pass")) {
				loggedInOptions();
				
			}else {
				home();
			}
			break;
			default:
				System.out.println("PLEASE CHOOSE AN OPTION");
				home();
				
				
		}
	}
	
	
	static void loggedInOptions() {
		System.out.println("What would you like to do today? \n"
				+ "1. Check Balance \n"
				+ "2. Deposit \n"
				+ "3. Withdrawal \n"
				+ "4. Create Account \n"
				+ "5. Log Out \n");
		String option = scan.nextLine();
		
		
		
		switch(option) {
		case "1": 
			System.out.println(bank.checkBalance("1"));
			loggedInOptions();
			break;
		case "2":
//			System.out.println("Enter a Deposit Amount \n");
//			String depAmount = scan.nextLine();
//			Double result = Double.parseDouble(depAmount);
//			bank.deposit(result, "1");
			
			bank.deposit(1111, "1");
			loggedInOptions();
			break;
		case "3": 
//			System.out.println("Enter a Deposit Amount \n");
//			String withdrawalAmount = scan.nextLine();
//			Double result2 = Double.parseDouble(withdrawalAmount);
//			bank.deposit(result2, "1");
			
			
			bank.withdrawal(300000, "1");
			loggedInOptions();
		case "4": 
			
//			System.out.println("Enter your initial deposit \n");
//			String initialDep = scan.nextLine();
//			Double result3 = Double.parseDouble(initialDep);
//			bank.deposit(result3, "1");
			
			
			bank.createAccount(5000, "savings");
			loggedInOptions();
		case "5":

			bank.signOut();
			home();
			break;
			
			default:
				System.out.println("PLEASE CHOOSE AN OPTION");
				loggedInOptions();
				
				
		}
	}


	private static String parseDouble(String depAmount) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//End of class
}
