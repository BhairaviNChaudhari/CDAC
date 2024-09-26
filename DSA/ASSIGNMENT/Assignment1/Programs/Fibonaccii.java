package Assignment1.ADS;
/* Fibonacci Series
Problem: Write a Java program to print the first n numbers in the Fibonacci series.

Test Cases:

Input: n = 5
Output: [0, 1, 1, 2, 3]
Input: n = 8
Output: [0, 1, 1, 2, 3, 5, 8, 13]

*/
import java.util.*;
public class Fibonaccii {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int t1 = 0;
	int t2 =1;
	int sum=0;
	for(int i=0;i<=n;i++)
	{
		 System.out.print(t1+" ");
	    sum = t1+t2;
		t1=t2;
		t2=sum;
	   
	}
	
	sc.close();
	
	
}
}

//5
//0 1 1 2 3 5
//Since each iteration performs constant-time operations, and the loop runs 
//n+1 times, the total time complexity of the loop is 
//O(n).
//Overall Space Complexity: 
//O(1)