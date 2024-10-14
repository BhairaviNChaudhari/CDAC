package Stack;

class Stack {
	Stack(){
		top = -1;
	}

	static final int max = 10;
	int top;
	int a[] = new int[max];

	boolean isEmpty() {
		return (top < 0);

	}

	boolean push(int x) {
		if (top>=(max-1)) {
			System.out.println("Stack overflow");
			return false;
		}
		a[++top]=x;
		return true;

	}
	int pop(){
		if(top<0)
		{
			System.out.println("Underflow");
			return 0;
		
		}
		return a[top--];
		
	}
	int peek() {
		return(top<0)? 0: a[top];
	}
//	if(top<0)
//		return o;
//	else
//		return a[top];
	
	void display() {
		if (isEmpty()){
			System.out.println("empty stack!!!");
		}
		else 
			System.out.println("Stack elements are:");
		show (top);
		System.out.println();
	}
	void show (int index)
	{
		if (index<0)
			return;
		System.out.println(a[index]+" ");
		show (index-1);
	}
}

public class ArrStack {
	public static void main(String[] args) {
       Stack sk = new Stack();
       
       sk.push(10);
       sk.push(20);
       sk.push(30);
       sk.push(29);
       
       sk.display();
       sk.pop();
       sk.display();
       }

	

}
