package Assignment2.j.str;
import java.util.*;
public class ReverseWord {
	    public static String reverseWords(String str) {
	        String[] words = str.split(" ");
	        StringBuilder reversed = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversed.append(words[i]);
	            if (i > 0) {
	                reversed.append(" ");
	            }
	        }
	        return reversed.toString();
	    }

	    public static void main(String[] args) {
	        System.out.println(reverseWords("Hello World")); // Output: "World Hello"
	        System.out.println(reverseWords("Java Programming")); // Output: "Programming Java"
	    }
	}

//World Hello
//Programming Java
//Time Complexity: O(n), where n is the length of the string. The split and append operations each take linear time.
//Space Complexity: O(n). An array of words and a new string are created, both requiring space proportional to the length of the original string.
