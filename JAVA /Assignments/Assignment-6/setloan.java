package oop.java.assignment6;

import java.util.Scanner;

//Implement a system to calculate and display the monthly payments for a mortgage loan. The system should:
//1.	Accept the principal amount (loan amount), annual interest rate, and loan term (in years) from the user.
//2.	Calculate the monthly payment using the standard mortgage formula:
//o	Monthly Payment Calculation:
//	monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)
//	Where monthlyInterestRate = annualInterestRate / 12 / 100 and numberOfMonths = loanTerm * 12
//	Note: Here ^ means power and to find it you can use Math.pow( ) method
//3.	Display the monthly payment and the total amount paid over the life of the loan, in Indian Rupees (₹).
//Define class LoanAmortizationCalculator with methods acceptRecord, calculateMonthlyPayment & printRecord and test the functionality in main method.
//
class LoanAmortizationCalculator {
	private double principal;
	private double i;
	private int y;
	double monthlyInterestRate;
	double numberOfMonths;
	double monthlyPayment;
	double totalPayment;

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getI() {
		return i;
	}

	public void setI(double i) {
		this.i = i;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getMonthlyInterestRate() {
		return i / 12 / 100;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getNumberOfMonths() {
		return y * 12;
	}

	public void setNumberOfMonths(double numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}

	public double getMonthlyPayment() {
		return (getPrincipal()
				* (getMonthlyInterestRate() * (Math.pow(1 + getMonthlyInterestRate(), getNumberOfMonths())))
				/ (Math.pow(1 + getMonthlyInterestRate(), getNumberOfMonths()) - 1));
	}

	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public void acceptRecord() {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the Loan amount : ");
		setPrincipal(sc.nextDouble());
		System.out.print("Enter the anual interest rate : ");
		setI(sc.nextDouble());
		System.out.print("Enter the term of loan in years :");
		setY(sc.nextInt());

	}

	public void printRecord() {
		double monthlyPayment = getMonthlyPayment();
		double total = getTotalPayment();
		System.out.println("monthlyPayment: " + monthlyPayment);
		System.out.println("TotalPayment: " + total);
	}

	public double getTotalPayment() {
		return getMonthlyPayment() * getY() * 12;
	}

	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}

}

public class setloan {
	public static void main(String[] args) {
		LoanAmortizationCalculator ref = new LoanAmortizationCalculator();
		ref.acceptRecord();
		ref.printRecord();

	}
}

//enter the Loan amount : 90000
//Enter the anual interest rate :  70
//Enter the term of loan in years :3
//monthlyPayment: 6033.751371552185
//TotalPayment: 217215.04937587868
