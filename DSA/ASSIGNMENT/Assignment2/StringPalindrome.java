package Assignment2.j.str;

import java.util.Scanner;

public class StringPalindrome {
	 public static boolean isPalindrome(String str) {
	        int left = 0, right = str.length() - 1;
	        while (left < right) {
	            if (str.charAt(left++) != str.charAt(right--)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string: ");
	        String str=sc.nextLine();
	        System.out.println(isPalindrome(str));
	    }
}
//Enter the string: 
//abba
//true

//Time Complexity: O(n), where n is the length of the string. The loop compares characters from both ends.
//Space Complexity: O(1). No extra space is used apart from a few variables.