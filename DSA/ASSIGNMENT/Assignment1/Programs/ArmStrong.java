package Assignment1.ADS;
//Write java program check whether the given number is armstrong or not:
import java.util.Scanner;
public class ArmStrong{
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number ");
		int num = sc.nextInt();
		int temp=num;
		int sum=0;
		while (temp!=0) {
			int digit = temp%10;
			temp =temp /10;
			sum +=(int)Math.pow(digit, 3);
		}
		if (sum==num) {
			System.out.println("Armstrong num "+num);
		}
		else {
			System.out.println("not a armstrong " +num);
		}
		sc.close();
	}
	
}
//n this loop, the number of iterations depends on the number of digits in the input number.
//Inside the loop, calculating 

//Math.pow(digit,3) is a constant-time operation since you're always raising the digit to a fixed power (3).
//Thus, the total time complexity of the loop is 
/*
 * O(logn), where num is the value of the input number. Comparison: The
 * comparison if (sum == num) is also a constant-time operation, O(1). Overall
 * Time Complexity: O(logn)
 */

/*
 * Input Number: You store the input number in a variable num, which takes O(1)
 * space.
 * 
 * Temporary Variables: You use a few integer variables (temp, digit, sum),
 * which also take constant space, i.e. O(1).
 */

//First iteration of the loop:
//digit = 153 % 10 = 3
//sum += 3^3 = 27
//temp = 153 / 10 = 15
//Second iteration:
//digit = 15 % 10 = 5
//sum += 5^3 = 27 + 125 = 152
//temp = 15 / 10 = 1
//Third iteration:
//digit = 1 % 10 = 1
//sum += 1^3 = 152 + 1 = 153
//temp = 1 / 10 = 0 (loop ends)