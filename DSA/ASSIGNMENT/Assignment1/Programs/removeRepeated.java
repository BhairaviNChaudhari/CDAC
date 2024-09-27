package Assignment1.ADS;
import java.util.*;
public class removeRepeated {

	    public static Set<Character> findRepeatedCharacters(String str) {
	        Set<Character> seen = new HashSet<>();
	        Set<Character> repeated = new HashSet<>();

	        // Traverse through each character of the string
	        for (char c : str.toCharArray()) {
	            // If the character has already been seen, add it to repeated
	            if (seen.contains(c)) {
	                repeated.add(c);
	            } else {
	                // Add the character to the seen set
	                seen.add(c);
	            }
	        }

	        return repeated;
	    }

	    public static void main(String[] args) {
	        // Test cases
	    	  Scanner sc = new Scanner (System.in);
	          System.out.println("Enter the string :");
	          String str = sc.nextLine();

	        System.out.println("Repeated characters in \"" + str + "\": " + findRepeatedCharacters(str));
	    }
	}

