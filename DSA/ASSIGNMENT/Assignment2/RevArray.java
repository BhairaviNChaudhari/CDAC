package Assignment2.j.str;

import java.util.Arrays;

public class RevArray {
	 public static void reverse(int[] arr) {
	        int left = 0, right = arr.length - 1;
	        while (left < right) {
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;
	            left++;
	            right--;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {6,8,7,3,4,2,6};
	        reverse(arr1);
	        System.out.println(Arrays.toString(arr1)); // Output: [4, 3, 2, 1]

	        int[] arr2 = {7, 8, 9};
	        reverse(arr2);
	        System.out.println(Arrays.toString(arr2)); // Output: [9, 8, 7]
	    }
}

//[6, 2, 4, 3, 7, 8, 6]
//[9, 8, 7]
//Time Complexity: O(n), where n is the length of the array. The loop iterates over half of the elements.
//Space Complexity: O(1). The array is reversed in place without using extra space.
