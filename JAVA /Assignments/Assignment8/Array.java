package Array.Multi.ragged;

import java.util.Scanner;

//1.	Declare a single-dimensional array of 5 integers inside the main method. 
//Traverse the array to print the default values. 
//Then accept records from the user and print the updated values of the array.
//

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int myArray[] = new int[5];
		System.out.println("Default Array: ");
		for (i = 0; i < myArray.length; i++) {
			System.out.print(" "+myArray[i]);
		}
		System.out.println("\nEnter the Array :");
		for (i = 0; i < myArray.length; i++) {
			myArray[i] = sc.nextInt();
		}
		System.out.println("Elements of the array are : ");
		for (i = 0; i < myArray.length; i++) {
			System.out.print(" " +myArray[i]);
		}
		sc.close();
	}
	
}


//Default Array: 
//	 0 0 0 0 0
//	Enter the Array :
//	8
//	6
//	5
//	3
//	6
//	Elements of the array are : 
//	 8 6 5 3 6