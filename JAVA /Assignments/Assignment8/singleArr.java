package Array.Multi.ragged;
//7.Declare a single-dimensional array as a field inside a class and instantiate it inside the class constructor. 
//Define methods named acceptRecord and printRecord within the class and test their functionality.
import java.util.Scanner;
public class singleArr {
	private int[] arr;
	Scanner sc = new Scanner(System.in);
	
	singleArr(){
		System.out.println("Enter the size: ");
        int size = sc.nextInt();  
        this.arr = new int[size];
	}
	
	public singleArr(int size) {
		this.arr = new int[size];
	}

	private void acceptRecord() {
		System.out.println("Enter the elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
	}
	
	private void printRecord() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
	}
	
	public static void main(String args[]) {
		
		singleArr d = new singleArr();
		d.acceptRecord();
		d.printRecord();
	}


}

//Enter the size: 
//5
//Enter the elements: 
//1
//2
//4
//5
//3
//arr[0] = 1
//arr[1] = 2
//arr[2] = 4
//arr[3] = 5
//arr[4] = 3

