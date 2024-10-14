package sort.j.a;
import java.util.*;
public class insertionSort {
		public static void insertionSort(int []arr) {
			//n-1 passes= in each pass consider ith element  as last element of array
			for (int i=1; i<arr.length; i++) {
				//copy last element into temp
				int j ,temp=arr[i];
				for( j=i-1; j>=0 && arr[j]>temp; j--) {
					arr [j+1] =arr[j];
					}
				arr[j+1]=temp;
				}
			}
		public static void main(String[] args) {
			int[] arr = {6,4, 2 , 8 ,3 ,1};
			System.out.println("Insertion sort ");
			System.out.println("Before:  " + Arrays.toString(arr));
			insertionSort(arr);
			System.out.println("After :" + Arrays.toString(arr));
			
		}

	}


