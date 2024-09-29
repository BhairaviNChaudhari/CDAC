package Assignment2.j.str;
import java.util.*;
public class RemwhiteSpace {
	    public static String removeWhiteSpaces(String str) {
	        return str.replaceAll("\\s", "");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string: ");
	        String str=sc.nextLine();
	        System.out.println(removeWhiteSpaces(str));
	        sc.close();
	    }

	}

//Enter the string: 
//bhairavi chaudhari
//bhairavichaudhari


//Time Complexity: O(n), where n is the length of the string. The replaceAll method has to check each character.
//Space Complexity: O(n). A new string is created with no white spaces, requiring extra space proportional to the length of the original string.