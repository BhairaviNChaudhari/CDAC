package Assignment1.ADS;
//Find Square Root
//Problem: Write a Java program to find the square root of a given number (using integer approximation).
//
//Test Cases:
//
//Input: x = 16
//Output: 4
//Input: x = 27
//Output: 5
import java.util.*;
public class Squareroot {
	public static int findSquareRoot(int x) {
        int result = 0;
        
        for (int i = 1; i * i <= x; i++) {
            result = i;
        }
        
        return result;
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = sc.nextInt();
		System.out.println("The square root of " + x + " is: " + findSquareRoot(x));
        sc.close();
	}
}
