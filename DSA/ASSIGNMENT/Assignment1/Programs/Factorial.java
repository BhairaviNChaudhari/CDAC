package Assignment1.ADS;
/*3. Factorial
Problem: Write a Java program to compute the factorial of a given number.

Test Cases:

Input: 5
Output: 120
Input: 0
Output: 1
*/
import java.util.*;
public class Factorial {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int fact=1;
	for (int i=1;i<=n;i++) {
		fact = fact*i;
	}
	System.out.println(+fact);
	sc.close();
}
}
//5
//120
//The overall time complexity is :
//O(n), where n is the input number.Single loop is used.
//Overall Space Complexity: 
//O(1)
//The space complexity is O(1) because the program only uses a fixed amount of space regardless of the input size.
