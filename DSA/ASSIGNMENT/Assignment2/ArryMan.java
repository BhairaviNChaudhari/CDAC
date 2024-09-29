package Assignment2.j.str;

public class ArryMan {
	public static int arrayManipulation(int n, int[][] queries) {
        int[] arr = new int[n + 1];
        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];
            int k = query[2];
            arr[a - 1] += k;
            if (b < n) {
                arr[b] -= k;
            }
        }

        int max = 0, current = 0;
        for (int value : arr) {
            current += value;
            max = Math.max(max, current);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] queries1 = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
        System.out.println(arrayManipulation(5, queries1)); // Output: 200

        int[][] queries2 = {{1, 3, 50}, {2, 4, 70}};
        System.out.println(arrayManipulation(4, queries2)); // Output: 120

}
}
//200
//120
//Time Complexity: O(n + m), where n is the size of the array and m is the number of queries. The first loop iterates over all the queries, and the second loop iterates over the array to find the maximum value.
//Space Complexity: O(n). An array of size n + 1 is used to perform the range updates.
