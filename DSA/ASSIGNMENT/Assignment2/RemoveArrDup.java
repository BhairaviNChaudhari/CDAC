package Assignment2.j.str;

public class RemoveArrDup {
	    public static int removeDuplicates(int[] arr) {
	        if (arr.length == 0) return 0;
	        int index = 1;
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] != arr[i - 1]) {
	                arr[index++] = arr[i];
	            }
	        }
	        return index;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 1, 2};
	        System.out.println(removeDuplicates(arr1)); // Output: 2

	        int[] arr2 = {0, 0, 1, 1, 2, 2, 3, 3};
	        System.out.println(removeDuplicates(arr2)); // Output: 4
	    }
	}

//Time Complexity: O(n), where n is the length of the array. The loop iterates over all elements once.
//Space Complexity: O(1). No extra space is used; the array is modified in place.
