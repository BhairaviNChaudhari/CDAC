package Assignment2.j.str;
import java.util.*;
public class ArrayLroatation {
	    public static void rotateLeft(int[] arr, int d) {
	        int n = arr.length;
	        d = d % n;
	        reverse(arr, 0, d - 1);
	        reverse(arr, d, n - 1);
	        reverse(arr, 0, n - 1);
	    }

	    private static void reverse(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4, 5};
	        rotateLeft(arr1, 2);
	        System.out.println(Arrays.toString(arr1)); // Output: [3, 4, 5, 1, 2]

	        int[] arr2 = {10, 20, 30, 40};
	        rotateLeft(arr2, 1);
	        System.out.println(Arrays.toString(arr2)); // Output: [20, 30, 40, 10]
	    }
}
//Time Complexity: O(n), where n is the length of the array. Each of the three reverse operations takes linear time.
//Space Complexity: O(1). The rotation is done in place without using extra space.