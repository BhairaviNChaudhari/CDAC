package Assignment2.j.str;

import java.util.Scanner;

public class ReverseStr {
	public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string: ");
	        String str=sc.nextLine();
	        System.out.println(reverse(str));
	        sc.close();
    }

}
//Enter the string: 
//hello
//olleh

//Time Complexity: O(n), where n is the length of the string. The StringBuilder.reverse() method takes linear time.
//Space Complexity: O(n). A new string is created as a result of the reversal.