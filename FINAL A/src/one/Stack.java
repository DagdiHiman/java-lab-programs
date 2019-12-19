package one;

interface DataStructure{
	public void push(int item);
	public int pop();
	public boolean isEmpty();
	public boolean isFull();
}

public class Stack implements DataStructure {
	private int arr[];
	private int top;
	private int capacity;
	
	Stack(int size)
	{
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	
	public void push(int x)
	{
		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated\n");
			System.exit(1);
		}
		System.out.println("Inserting " + x);
		arr[++top] = x;
	}
	
	public int pop()
	{
		if (isEmpty())
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		int n = arr[top--];
		System.out.println("Removing " + n);
		return n;
	}

	public boolean isEmpty()
	{
		return top == -1;
	}

	public boolean isFull()
	{
		return top == capacity - 1;
	}
	
	public static void main(String[] args) {
		System.out.println("\n\t\t---------STACK------------\n");
		Stack stack = new Stack(3);
		stack.push(1);
		stack.push(2);
		stack.pop();
		stack.pop();
		stack.push(3);
		stack.pop();
	}
}
