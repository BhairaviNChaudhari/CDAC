package Assignment1.ADS;
/*Prime Number
Problem: Write a Java program to check if a given number is prime.

Test Cases:

Input: 29
Output: true
Input: 15
Output: false
*/
import java.util.*;
public class Prime
{
	
      static boolean isPrime(int n)
    {
    	 
        if (n <= 1)
            return false;
        // Check if number is 2
        else if (n == 2)
            return true;

        // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
         
        return true;
   
    }

 
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
   	      n = sc.nextInt();
		if (isPrime(n))
            System.out.println("true");

        else
            System.out.println("false");
		  sc.close();
    }
    
}

//29
//true


Time complexity is :O(√n)
The space complexity is 

O(1) because the space used by the program does not depend on the input size.