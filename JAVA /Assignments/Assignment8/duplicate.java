package Array.Multi.ragged;
//4.Write a program to remove duplicate elements from a single-dimensional array of integers.
import java.util.Arrays;
import java.util.Scanner;
public class duplicate {
	
	    private int[] arr;
	    private int size;

	    public void acceptRecord() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size: ");
	        size = sc.nextInt();
	        arr = new int[size];

	        System.out.println("Enter the elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }
	        sc.close();
	    }
	    
	    public int[] removeDuplicates() {
	        Arrays.sort(arr); 
	        int newSize = 0;

	        for (int i = 0; i < size; i++) {
	            if (i == 0 || arr[i] != arr[i - 1]) {
	                arr[newSize++] = arr[i];
	            }
	        }
	        int[] res = new int[newSize];
	        for (int i = 0; i < newSize; i++) {
	            res[i] = arr[i];
	        }
	        return res;
	    }

	    public void printRecord(int[] arr) {
	        System.out.println("Array without duplicates:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	
	public static void main(String[] args) {
		duplicate p = new duplicate();
      p.acceptRecord();
      int[] uniqueArray = p.removeDuplicates();
      p.printRecord(uniqueArray);

	}

}


//Enter the elements:
//2
//3
//4
//2
//3
//1
//3
//2
//8
//9
//Array without duplicates:
//1 2 3 4 8 9 

