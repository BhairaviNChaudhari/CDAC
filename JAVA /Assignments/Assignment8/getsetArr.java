package Array.Multi.ragged;
//8.Modify the previous assignment to use getter and setter methods instead of acceptRecord and printRecord.
import java.util.Scanner;
public class  getsetArr {
	    private int[] arr;
	    Scanner sc = new Scanner(System.in);
	   
	    getsetArr() {
	        System.out.println("Enter the size: ");
	        int size = sc.nextInt();  
	        this.arr = new int[size];
	    }
	 
	    public  getsetArr(int size) {
	        this.arr = new int[size];
	    }

	    public void setElements() {
	        System.out.println("Enter the elements: ");
	        for(int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt(); 
	        }
	    }

	    public int[] getElements() {
	        return this.arr; 
	    }

	    public void displayElements() {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println("arr[" + i + "] = " + arr[i]);
	        }
	    }
	    
	    public static void main(String args[]) {
	    	 getsetArr d = new  getsetArr(); 
	        d.setElements(); 
	        d.displayElements(); 
	        d.sc.close(); 
	    }
}
//Enter the size: 
//5
//Enter the elements: 
//3
//5
//3
//4
//2
//arr[0] = 3
//arr[1] = 5
//arr[2] = 3
//arr[3] = 4
//arr[4] = 2
