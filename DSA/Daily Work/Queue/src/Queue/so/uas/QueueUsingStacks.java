package Queue.so.uas;

public class QueueUsingStacks {
	    private int[] inputStack;
	    private int[] outputStack;
	    private int inputTop;
	    private int outputTop;

	    // Constructor
	    public QueueUsingStacks(int size) {
	        inputStack = new int[size];
	        outputStack = new int[size];
	        inputTop = -1;  // Initialize the top index of inputStack
	        outputTop = -1; // Initialize the top index of outputStack
	    }

	    // Method to push an element onto a stack
	    private void pushToInputStack(int value) {
	        if (inputTop < inputStack.length - 1) {
	            inputStack[++inputTop] = value;
	        } else {
	            System.out.println("Input stack is full!");
	        }
	    }

	    // Method to pop an element from a stack
	    private int popFromInputStack() {
	        if (inputTop >= 0) {
	            return inputStack[inputTop--];
	        }
	        System.out.println("Input stack is empty!");
	        return -1; // Return -1 if the stack is empty
	    }

	    // Method to push an element onto output stack
	    private void pushToOutputStack(int value) {
	        if (outputTop < outputStack.length - 1) {
	            outputStack[++outputTop] = value;
	        } else {
	            System.out.println("Output stack is full!");
	        }
	    }

	    // Method to pop an element from output stack
	    private int popFromOutputStack() {
	        if (outputTop >= 0) {
	            return outputStack[outputTop--];
	        }
	        System.out.println("Output stack is empty!");
	        return -1; // Return -1 if the stack is empty
	    }

	    // Enqueue operation
	    public void enqueue(int value) {
	        pushToInputStack(value);
	    }

	    // Dequeue operation
	    public int dequeue() {
	        // If both stacks are empty, return -1
	        if (inputTop == -1 && outputTop == -1) {
	            System.out.println("Queue is empty!");
	            return -1;
	        }

	        // If output stack is empty, transfer elements from input stack
	        if (outputTop == -1) {
	            while (inputTop >= 0) {
	                pushToOutputStack(popFromInputStack());
	            }
	        }

	        // Return the top element of the output stack
	        return popFromOutputStack();
	    }

	    // Method to display the queue
	    public void displayQueue() {
	        System.out.print("Queue = [");
	        
	        // Temporary array to show the queue
	        for (int i = outputTop; i >= 0; i--) {
	            System.out.print(outputStack[i] + (i == 0 ? "" : ", "));
	        }
	        
	        // Print elements from the input stack
	        for (int i = 0; i <= inputTop; i++) {
	            System.out.print(inputStack[i] + (i == inputTop ? "" : ", "));
	        }

	        System.out.println("]");
	    }

	    public static void main(String[] args) {
	        QueueUsingStacks queue = new QueueUsingStacks(10); // Create a queue with a size of 10

	        // Test Case 1
	        queue.enqueue(3);
	        queue.enqueue(7);
	        int dequeuedElement1 = queue.dequeue();
	        System.out.print("Test Case 1: ");
	        queue.displayQueue(); // Output: [7]
	        System.out.println("Dequeued element = " + dequeuedElement1); // Output: 3

	        // Test Case 2
	        queue.enqueue(10);
	        queue.enqueue(20);
	        int dequeuedElement2 = queue.dequeue();
	        int dequeuedElement3 = queue.dequeue();
	        System.out.print("Test Case 2: ");
	        queue.displayQueue(); // Output: []
	        System.out.println("Dequeued elements = " + dequeuedElement2 + ", " + dequeuedElement3); // Output: 10, 20
	    }
	}



