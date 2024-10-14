package Queue.so.uas;
//Queue operation using array;
class Que {
	int size = 5;
	int Q[] = new int[size];
	int front, rear;


	Que() {
		front = -1;
		rear = -1;
	}

	boolean isEmpty() {
		return (front == -1);
	}

	boolean isFull() {
		return (rear == -1);
	}

// enqueue in Queue
void enqueue(int x){
	if(isFull()){
		System.out.println("Queue is full");
	}
	else {
		if (front == -1) {
			front =0;//set queue at 0 if it is empty queue
		}
		rear++;
		Q[rear]=x;
		System.out.println(x+ " inserted");
	}
}
int dequeue() {
	if (isEmpty()) {
		System.out.println("empty queue!!");
		return -1;
		
	}
	else {
		int x = Q[front];
		System.out.println(x+ " deleted");
		if (front > rear) {
			front = -1;
			rear = -1;
		}
		else {
			front++;
			
		}
		return x;
		
	}

 }
void display() {
	if(isEmpty()) {
		System.out.println("Empty");
	}
	else {
		System.out.println("Queue elements are!!  ");
		for(int i = front;i<=rear;i++)
		{
			System.out.print("[ " +Q[i]+" ]");
		}
		System.out.println();
	}
}
}
public class SimpleQ {
public static void main(String[] args) {
	Que q1= new Que();
	q1.enqueue(5);
	q1.enqueue(4);

	q1.display();
	
	
	
}
}
