package interest.comp;

import java.util.Scanner;

//4. Discount Calculation for Retail Sales
//Design a system to calculate the final price of an item after applying a discount. The system should:
//1.	Accept the original price of an item and the discount percentage from the user.
//2.	Calculate the discount amount and the final price using the following formulas:
//o	Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
//o	Final Price Calculation: finalPrice = originalPrice - discountAmount
//3.	Display the discount amount and the final price of the item, in Indian Rupees (₹).
//Define class DiscountCalculator with methods acceptRecord, calculateDiscount & printRecord and test the functionality in main method.
class DiscountCalculator{
	float discountAmount;
	float originalPrice;
	float discountRate;
	float finalPrice;
	
	public void acceptRecord() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter original price:   ");
		originalPrice=sc.nextFloat();
		System.out.print("Enter Discountrate:     ");
		discountRate= sc.nextFloat();
		
		
	}
	public void calculateDiscount() {
		discountAmount = originalPrice * (discountRate / 100);
		finalPrice = originalPrice - discountAmount;
		
	}
	public void printRecord() {
		System.out.println("Original amount is : "+originalPrice);
		System.out.println("Discount rate is   : "+discountRate);
		System.out.println("Discount Amount is : "+discountAmount);
		System.out.println("Final price is     : "+finalPrice);	
	}

}

public class discount {
	public static void main(String[] args) {
		DiscountCalculator dc = new DiscountCalculator();
		dc.acceptRecord();
		dc.calculateDiscount();
		dc.printRecord();
		
	}

}
