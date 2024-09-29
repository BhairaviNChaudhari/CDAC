package Assignment2.j.str;

/*Problem: Write a Java program to print patterns such as a right triangle of stars.

Test Cases:

Input: n = 3
Output:
*
**
***
Input: n = 5
Output:
*
**
***
****
*****
*/
import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {
		

	int i,j,n;
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	for (i=0;i<=n;i++) {
		for (j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
	
	}
}

//3
//
//* 
//** 
//*** 

//5
//
//* 
//** 
//*** 
//**** 
//***** 
