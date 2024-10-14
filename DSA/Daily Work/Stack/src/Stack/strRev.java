package Stack;

class Stack2 {
    static final int max = 10;
    int top;
    char a[] = new char[max];  // Changed to char array to store characters

    Stack2() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(char x) {
        if (top >= (max - 1)) {
            System.out.println("Stack overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }

    char pop() {
        if (top < 0) {
            System.out.println("Underflow");
            return 0;
        }
        return a[top--];
    }

    char peek() {
        return (top < 0) ? 0 : a[top];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Empty stack!!!");
        } else {
            System.out.println("Stack elements are:");
            show(top);
            System.out.println();
        }
    }

    void show(int index) {
        if (index < 0)
            return;
        System.out.print(a[index] + " ");  // Changed to print for better formatting
        show(index - 1);
    }
}

public class strRev {
    static void reverse(StringBuffer str) {
        int n = str.length();
        Stack sk = new Stack();

        // Push into stack
        for (int i = 0; i < n; i++) {
            sk.push(str.charAt(i));
        }

        // Pop one by one
        for (int i = 0; i < n; i++) {
            char ch = (char) sk.pop();
            str.setCharAt(i, ch);
        }
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("HelloWorld");
        System.out.println("Original string: " + str);
        reverse(str);
        System.out.println("Reversed string: " + str);
    }
}
