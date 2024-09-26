package Assignment1.ADS;
/*9. Integer Palindrome
Problem: Write a Java program to check if a given integer is a palindrome.

Test Cases:

Input: 121
Output: true
Input: -121
Output: false*/

import java.util.Scanner;
public class Palindrome{
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number ");
		int num = sc.nextInt();
		int temp=num;
		int reverse=0;
		while (num!=0) {
			int rem = num%10;
			reverse =reverse *10+rem;
			num=num/10;
		}
		if (reverse==temp) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		sc.close();
	}
	
}
Time complexity: The number of digits in num is approximately 
O(log 10(n))
​
Space Complexity: O(1)

enter number 
121
True
