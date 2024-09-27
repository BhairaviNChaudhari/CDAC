package Assignment1.ADS;
/*5. Find GCD
Problem: Write a Java program to find the Greatest Common Divisor (GCD) of two numbers.

Test Cases:

Input: a = 54, b = 24
Output: 6
Input: a = 17, b = 13
Output: 1*/
import java.util.*;
public class GCD {
	public static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number: ");
		int num2 = sc.nextInt();
		System.out.println(gcd(num1,num2));
		
		sc.close();
	}

}

/*
 * Enter the First number: 54 Enter the Second number: 24 6
 */

//T = O(log(min(num1,num2))).       

