package oop.java.assignment6;

import java.util.Scanner;

class DiscountCalculator {
	float discountAmount;
	float originalPrice;
	float discountRate;
	float finalPrice;
	

	public float getDiscountAmount() {
		return (getOriginalPrice()*getDiscountRate() / 100);
	}

	public void setDiscountAmount(float discountAmount) {
		this.discountAmount = discountAmount;
	}

	public float getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}

	public float getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}
	
	public float getFinalPrice() {
		return (getOriginalPrice() - getDiscountAmount());
	}

	public void setFinalPrice(float finalPrice) {
		this.finalPrice = finalPrice;
	}

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter original price:   ");
		setOriginalPrice(sc.nextFloat());
		System.out.print("Enter Discountrate:     ");
		setDiscountRate(sc.nextFloat());
        sc.close();
	}

		

	public void printRecord() {
		float discountA = getDiscountAmount();
		float finalp = getFinalPrice();
		float discount =getDiscountRate();
		float original = getOriginalPrice();
		System.out.println("Original amount is : " + original);
		System.out.println("Discount rate is   : " + discount);
		System.out.println("Discount Amount is : " + discountA);
		System.out.println("Final price is     : " + finalp);
	}

}

public class setdiscount {
	public static void main(String[] args) {
		DiscountCalculator dc = new DiscountCalculator();
		dc.acceptRecord();
		dc.printRecord();

	}

}
//Enter original price:   1000
//Enter Discountrate:      20
//Original amount is : 1000.0
//Discount rate is   : 20.0
//Discount Amount is : 200.0
//Final price is     : 800.0
