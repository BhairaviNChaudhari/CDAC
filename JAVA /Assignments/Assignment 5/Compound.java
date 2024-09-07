package interest.comp;
import java.util.*;
//2. Compound Interest Calculator for Investment
//Develop a system to compute the future value of an investment with compound interest. The system should:
//1.	Accept the initial investment amount, annual interest rate, number of times the interest is compounded per year, and investment duration (in years) from the user.
//2.	Calculate the future value of the investment using the formula:
//o	Future Value Calculation:
//	futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)
//o	Total Interest Earned: totalInterest = futureValue - principal
//3.	Display the future value and the total interest earned, in Indian Rupees (₹).
//Define class CompoundInterestCalculator with methods acceptRecord , calculateFutureValue, printRecord and test the functionality in main method.
//
class CompoundInterestCalculator {
	
	double  annualInterestRate ;
	double  numberOfCompounds;
	int years;
	double principal;
	double futureValue, totalInterest;
	public void acceptRecord() {
		Scanner sc = new Scanner (System.in);	
		
		System.out.print("enter Annual interest Rate : ");
		annualInterestRate= sc.nextDouble();
		System.out.print("Enter number of compounds  : ");
		numberOfCompounds=sc.nextDouble();
		System.out.print("Enter the years            : ");
		years= sc.nextInt();
		System.out.print("enter the compound         : ");
		principal = sc.nextDouble();
		
	}
	public void calculateFutureValue() {
		futureValue = (principal * (1 + annualInterestRate / Math.pow(annualInterestRate, numberOfCompounds)) * years);
         totalInterest = futureValue - principal;
	}
	
	public void printRecord() {
		System.out.println("Future Value         : "+futureValue);
		System.out.println("Total interest erned : ₹" +totalInterest);
	}
	
	
}



public class Compound {
	public static void main(String[] args) {
		CompoundInterestCalculator CI= new CompoundInterestCalculator();
		CI.acceptRecord();
		CI.calculateFutureValue();
		CI.printRecord();
		
	}
}

//enter Annual interest Rate : 90000
//Enter number of compounds  : 10
//Enter the years            : 2
//enter the compound         : 20
//Future Value         : 40.0
//Total interest erned : ₹20.0
