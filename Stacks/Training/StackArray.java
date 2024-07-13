package Training;

import java.util.*;

public class StackArray {
	
	int stack[];
	int top;
	
	StackArray(int size){
		stack=new int[size];
		top=-1;	
	}
	
	void push(int ele) {
		if(top==stack.length-1)
			System.out.println("Stack Overflow");
		else
			stack[++top]=ele;
	}
	
	void pop() {
		if(top==-1) {
			System.out.println("Underflow");
		}
		else {
			System.out.println("The popped item is"+stack[top--]);
		}
	}

	void peek() {
		if(top==-1) {
			System.out.println("Underflow");
		}
		else {
			System.out.println("The topmost item is"+stack[top]);
		}
	}

	void display() {
		if(top==-1) {
			System.out.println("Underflow");
		}
		else {
			for(int i=top;i>=0;i--) {
				System.out.println(stack[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the size of stack");
		int maxsize=input.nextInt();
		
		
		StackArray st=new StackArray(maxsize);
		
		while(true)
		{
			System.out.println("1. Push element in stack");
			System.out.println("2. Pop an element from Stack");
			System.out.println("3. Display the Stack");
			System.out.println("4. Peek the top element");
			System.out.println("5. Exit");
			System.out.print("Select your option: ");
			int ch = input.nextInt();
			
			switch(ch)
			{
			case 1: System.out.print("Enter the element to push: ");
				    int ele = input.nextInt();
				    st.push(ele);
				    break;
				    
			case 2: st.pop();
					break;
			
			case 3: st.display();
				    break;
			case 4: st.peek();
		    		break;
			
			case 5: input.close();
                    System.exit(0);
			}
		}
	}
}
