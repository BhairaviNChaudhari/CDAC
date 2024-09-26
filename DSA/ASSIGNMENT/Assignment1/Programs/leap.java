package Assignment1.ADS;
import java.util.*;
/*10. Leap Year
Problem: Write a Java program to check if a given year is a leap year.

Test Cases:

Input: 2020
Output: true
Input: 1900
Output: false*/

public class leap {
		   public static void main (String[]args)
		   {
             Scanner sc = new Scanner(System.in);
		     int year =sc.nextInt();

		     if (year % 400 == 0)
		       System.out.println (" True");

		     else if (year % 4 == 0 && year % 100 != 0)
		       System.out.println ("True");

		     else
		         System.out.println ("False");

		   }
		 }


			/*
			 * Time Complexity:
			 * 
			 * O(1) Space Complexity:
			 * 
			 * O(1) This program efficiently checks if a year is a leap year using constant
			 * time and space. Let me know if you need further clarification!
			 */
//2004
//True