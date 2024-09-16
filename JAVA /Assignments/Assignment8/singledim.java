package Array.Multi.ragged;
//5.Write a program to find the intersection of two single-dimensional arrays.
import java.util.Scanner;
public class singledim {
	
	public int[] acceptRecord(int size) {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[size];

      System.out.println("Enter " + size + " elements:");
      for (int i = 0; i < size; i++) {
          arr[i] = sc.nextInt();
      }

      return arr;
  }
	public void findIntersection(int[] arr1, int[] arr2) {
      System.out.println("Intersection of the two arrays:");
      for (int i = 0; i < arr1.length; i++) {
          for (int j = 0; j < arr2.length; j++) {
              if (arr1[i] == arr2[j]) {
                  System.out.print(arr1[i] + " ");
                  break; 
              }
          }
      }
      System.out.println();
  }
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      singledim obj = new singledim();

    
      System.out.print("Enter the size for the 1st array: ");
      int size1 = sc.nextInt();
      int[] arr1 = obj.acceptRecord(size1);

      System.out.print("Enter the size for the 2nd array: ");
      int size2 = sc.nextInt();
      int[] arr2 = obj.acceptRecord(size2);

      obj.findIntersection(arr1, arr2);

      sc.close();
  }
	

}
