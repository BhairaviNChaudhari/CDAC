package Assignment2.j.str;
import java.util.*;
public class ReverseNum {
	    public static int reverse(int num) {
	        int reversed = 0;
	        while (num != 0) {
	            reversed = reversed * 10 + num % 10;
	            num /= 10;
	        }
	        return reversed;
	    }

	    public static void main(String[] args) {
	       Scanner Sc = new Scanner (System.in);
	       System.out.println("Enter a number: ");
	       int i = Sc.nextInt();
	       System.out.println(reverse(i));
	    }
	}
//Enter a number: 
//58967349
//94376985
//Time Complexity: O(d), where d is the number of digits in the given number. Each digit is processed once.
//Space Complexity: O(1). No extra space is used.