package Queue.so.uas;

import java.util.Scanner;



//Queue operation using array;
class Queue{
	private int[] arr;
	private int rear,front;
	public Queue(int size) {
		arr=new int [size];
		rear=-1;
		front=-1;
		
	}

	public boolean isEmpty() {
		return (front == rear && front == -1);
	}

	public boolean isFull() {
		return (front==-1 && rear==arr.length-1)||
				(front==rear && front!=-1);
		
	}

// enqueue in Queue
void enqueue(int val){
	if(isFull())
		throw new RuntimeException("Queue is full");
	rear=(rear+1)%arr.length;
	arr[rear]=val;
}
void dequeue() {
	if(isEmpty()) 
		throw new RuntimeException("Queue is empty");
	front=(front+1)%arr.length;
	if(front==rear){
		rear=-1;
		front=-1;
	}
	
}	
public int peek() {
	if(isEmpty()) 
		throw new RuntimeException("Queue is empty");
	    int index = (front+1)%arr.length;
		return arr[index];
}
}

public class Cir_queue {
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
	

