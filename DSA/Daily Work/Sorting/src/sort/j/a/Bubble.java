package sort.j.a;
import java.util.*;
public class Bubble {
		public static void Bubblesort(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {//to optimizzation we can do length-1-i
				//compare consecutive elements 
				//if left element is greater than right element then swap
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
			
		}
		public static void improvedBubblesort(int []arr) {
			boolean swapFlag=false;
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-1;j++) {//to optimizzation we can do length-1-i
					//compare consecutive elements 
					//if left element is greater than right element then swap
					if(arr[j]>arr[j+1]) {
						int temp = arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						swapFlag=true;
					}
				}
				if(!swapFlag)
					break;
				//if the bubble sort is already sorted then by using this flag technique time complexity
				//is O(1); 
			}
				
			}
		public static void main(String[] args) {
			int[] arr = {6,4, 2 , 8 ,3 ,1 	};
			System.out.println("Bubble sort ");
			System.out.println("Before:  " + Arrays.toString(arr));
			Bubblesort(arr);
			System.out.println("After :" + Arrays.toString(arr));
			
		}

	}


