package oop.java.assignment6;

import java.text.DecimalFormat;
import java.util.Scanner;

class CompoundInterestCalculator {
	private static final DecimalFormat df = new DecimalFormat("0.00");

	double annualInterestRate;
	double numberOfCompounds;
	int years;
	double principal;
	double futureValue, totalInterest;

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getNumberOfCompounds() {
		return numberOfCompounds;
	}

	public void setNumberOfCompounds(double numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getFutureValue() {
		return (getPrincipal() * (1
				+ getAnnualInterestRate() / Math.pow(getAnnualInterestRate(), getAnnualInterestRate()) * getYears()));
	}

	public void setFutureValue(double futureValue) {
		this.futureValue = futureValue;
	}

	public double getTotalInterest() {
		return (getFutureValue() - getPrincipal());
	}

	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter Annual interest Rate : ");
		setAnnualInterestRate(sc.nextDouble());
		System.out.print("Enter number of compounds  : ");
		setNumberOfCompounds(sc.nextDouble());
		System.out.print("Enter the years            : ");
		setYears(sc.nextInt());
		System.out.print("enter the compound         : ");
		setPrincipal(sc.nextDouble());

	}

	public void printRecord() {
		double future = getFutureValue();
		double t = getTotalInterest();
		System.out.println("Future Value         : " + df.format(future));
		System.out.println("Total interest erned : ₹" + df.format(t));
	}

}

public class setcompound {

	public static void main(String[] args) {
		CompoundInterestCalculator CI = new CompoundInterestCalculator();
		CI.acceptRecord();
		CI.printRecord();

	}
}
