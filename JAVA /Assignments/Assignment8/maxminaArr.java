package Array.Multi.ragged;
import java.util.Scanner;
public class maxminaArr {
	
	private static int[] acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array values: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
	
	private static void printRecord(int[] arr) {
		System.out.print("The array is: ");
		for(int i=0; i<arr.length; i++) {
			 System.out.print(arr[i]+ " ");
		}
	}
	
	private static int maxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int minNumber(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
	
	public static void main(String[] args) {
	
		int[] arr = maxminaArr.acceptRecord();
		maxminaArr.printRecord(arr);
        
        int max = maxminaArr.maxNumber(arr);
        int min = maxminaArr.minNumber(arr);
        
        System.out.println("\nMaximum Number is: " + max);
        System.out.println("Minimum Number is: " + min); 
		
	}

}
/*Enter the size of array: 
5
Enter the array values: 
7
8
6
41
2
The array is: 7 8 6 41 2 
Maximum Number is: 41
Minimum Number is: 2
*/