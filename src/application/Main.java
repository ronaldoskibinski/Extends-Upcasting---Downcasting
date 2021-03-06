package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Account acc = new Account(1001, "Ronaldo", 1000.0);
		BusinessAccount bAccount = new BusinessAccount(1002, "Alex", 1000.00, 500.0);
		
		// UPCASTING
		
		Account accOne = bAccount;
		Account accTwo = new BusinessAccount(1003, "Bob", 1000.0, 200.0);
		Account accThree = new SavingsAccount(1004, "Anna", 1000.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount accFour = (BusinessAccount)accTwo;
		
		// TEST CASTING
		if(accThree instanceof BusinessAccount) {
			BusinessAccount accFive = (BusinessAccount)accThree;
			accFive.loan(100.0);
			System.out.println("Loan!");
		}
		
		if(accThree instanceof SavingsAccount) {
			SavingsAccount accFive = (SavingsAccount)accThree;
			accFive.updateBalance();
			System.out.println("Update!");
		}
		
		acc.withdraw(200);
		accTwo.withdraw(200);
		accThree.withdraw(200);
		
		System.out.println(acc.getBalance());
		System.out.println(accTwo.getBalance());
		System.out.println(accThree.getBalance());
		
	}

}
