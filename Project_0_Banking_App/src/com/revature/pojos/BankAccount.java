package com.revature.pojos;

public class BankAccount {

	
	
	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	
	
	
	public BankAccount() {}
	
	public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
		System.out.println("account constructor with parameters called");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		
		
	}
	
	
	
	public void deposit(double depositAmount) {
		balance += depositAmount;
		System.out.println("deposited " + depositAmount + " New Balance = " + this.balance);
	}
	
	public void withdrawal(double withdrawalAmount) {
		if(this.balance - withdrawalAmount < 0) {
			System.out.println("Only "+ balance +" is available."
					+ "Withdrwal not processed");
		} else {
			balance -= withdrawalAmount;
			System.out.println("Withdrwal of "+ withdrawalAmount + "processed. Remaining balance = " + this.balance);
		}
		
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	// End of class
}
