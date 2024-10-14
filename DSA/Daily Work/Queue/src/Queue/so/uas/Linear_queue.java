package Queue.so.uas;

import java.util.Scanner;



//Queue operation using array;
class Que {
	private int[] arr;
	private int rear,front;
	public Que(int size) {
		arr=new int [size];
		rear=-1;
		front=-1;
		
	}

	public boolean isEmpty() {
		return rear==front;
	}

	public boolean isFull() {
		return rear==arr.length-1;
	}

// enqueue in Queue
void enqueue(int val){
	if(isFull())
		throw new RuntimeException("Queue is full");
	rear++;
	arr[rear]=val;
}
void dequeue() {
	if(isEmpty()) 
		throw new RuntimeException("Queue is empty");
	front++;
}	
public int peek() {
	if(isEmpty()) 
		throw new RuntimeException("Queue is empty");
		return arr[front+1];
}
}

public class Linear_queue {
public static void main(String[] args) {
	int val;
	Scanner sc = new Scanner(System.in);
	Que s = new Que(5);
	int ch;
	do {
		System.out.println("0.Exit \n1.enquque \n2.dequeue \n3.peek \n\nEnter the choice");
		ch = sc.nextInt();
		switch (ch) {
		case 1: // push
			try {
				System.out.println("Enter the value to push  ");
				val = sc.nextInt();
				s.enqueue(val);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

			break;
		case 2:// pop
			try {
				val = s.peek();
				s.dequeue();
				System.out.println("Popped :" + val);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

			break;
		case 3:// peek
			val = s.peek();
			try {
				System.out.println("Topmost :" + val);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			break;

		}
	} while (ch != 0);

	sc.close();
}	
}
	

