package org.co.bank;
import java.util.Scanner;
//1)	Create a base class BankAccount with methods like deposit() and withdraw(). Derive 
//a class SavingsAccount that overrides the withdraw() method to impose a limit on
//the withdrawal amount. Write a program that demonstrates the use of overridden methods 
//and proper access modifiers & return the details.
/*1)Create a base class BankAccount with methods like deposit() and withdraw(). 
Derive a class SavingsAccount that overrides the withdraw() method to impose a limit on the withdrawal amount. 
Write a program that demonstrates the use of overridden methods and proper access modifiers & return the details.
*/


class BankAccount {
	 private double balance;

	 public BankAccount(double balance) {
	        this.balance = balance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
	        } else {
	            System.out.println("Insufficient balance.");
	        }
	    }
	

}

class SavingsAccount extends BankAccount{
	private double withdrawalLimit;

    public SavingsAccount(double balance, double withdrawalLimit) {
        super(balance);  
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Exceeds withdrawal limit of " + withdrawalLimit);
        } else {
            super.withdraw(amount);
        }
    }
}

public class BankAc {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(1000, 500); 

        account.deposit(200);   
        account.withdraw(300);     
        account.withdraw(600);     
    }
	
}
