package Array.Multi.ragged;
/*2.Declare a single-dimensional array of 5 integers inside the main method. Define a method named acceptRecord 
to get input from the terminal into the array and another method named printRecord to print the state of the array 
to the terminal.*/
import java.util.Scanner;
public class terArray {
	
	private static void acceptRecord(int[] arr) {
		System.out.println("Enter the values: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();	
		}
		sc.close();
	}
	
	private static void printRecord(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		terArray.acceptRecord(arr);
		terArray.printRecord(arr);
		
	}

}
/*Output:
 Enter the values: 
4
5
3
5
1
4 5 3 5 1 */





