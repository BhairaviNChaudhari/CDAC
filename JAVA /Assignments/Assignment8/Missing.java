package Array.Multi.ragged;
//6.Write a program to find the missing number in an array of integers ranging from 1 to N.

import java.util.Scanner;
public class Missing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the array values: ");
		for(int i=0; i<(arr.length-1); i++) {
			arr[i] = sc.nextInt();
		}
      int missingNumber = findMissingNumber(arr, size);

      System.out.println("Missing number: " + missingNumber);
      sc.close();
  
	}
	
  public static int findMissingNumber(int[] arr, int n) {
      int totalSum = n * (n + 1) / 2;
      int arrSum = 0;
      for (int value : arr) {
          arrSum += value;
      }

      return totalSum - arrSum;
  }
}

//Enter the size of array: 
//5
//Enter the array values: 
//1
//2
//4
//5
//Missing number: 3


