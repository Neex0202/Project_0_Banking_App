package com.revature.Project_0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.Bank.Bank;
import com.revature.dao.UserDao;
import com.revature.pojos.BankAccount;
import com.revature.pojos.User;

public class Main extends Options{

	static Scanner scan = new Scanner(System.in);
	
//	public static UserDao userDao = new UserDao();
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
			bank.createUser("Nico", "Sta.ana", "nstaana", "123");
			home();
//			System.out.println("CREATE ACCOUNT");
			break;
		case "2":
//			function to login
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
			bank.deposit(1111, "1");
			loggedInOptions();
			break;
		case "3": 
			bank.withdrawal(300000, "1");
			loggedInOptions();
		case "4": 
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
	
	
	//End of class
}
