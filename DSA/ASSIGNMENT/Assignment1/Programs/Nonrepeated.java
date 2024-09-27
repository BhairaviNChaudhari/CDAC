package Assignment1.ADS;

import java.util.Scanner;

public class Nonrepeated {
	public static Character findFirstNonRepeatedCharacter(String str) {
        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Check if the character appears only once
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                return c;
            }
        }
        return null; // Return null if no non-repeated character is found
    }

    public static void main(String[] args) {
        // Test cases
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        
        System.out.println("First non-repeated character in \"" + str + "\": " + findFirstNonRepeatedCharacter(str));
        sc.close();
    }
}

//time complexity is O(n²) in the worst case.
