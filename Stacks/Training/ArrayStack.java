package Training;

import java.util.*;

public class ArrayStack {
    int [] stack;
    int top;

    ArrayStack(int size){
        stack = new int[size];
        top = -1;
    }

    void push (int ele){
        if (top==stack.length-1){
            System.out.println("Stack Overflow");
        }
        else{
            stack[++top] = ele;
        }
    }

    void pop(){
        if (top==-1){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.println(stack[top--]);
        }
    }

    void peek(){
        if (top==-1){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.println(stack[top]);
        }
    }

    void display(){
        if (top==-1){
            System.out.println("Stack Underflow");
        }
        else{
            for (int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = sc.nextInt();
        ArrayStack stk = new ArrayStack(size);

        while(true){
            System.out.println("1. Push element");
            System.out.println("2. Pop the element");
            System.out.println("3. Display topmost value");
            System.out.println("4. Display all values");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            int ch = sc.nextInt();
            switch(ch){
                case 1: System.out.print("Enter element :");
                        int ele = sc.nextInt();
                        stk.push(ele);
                        break;
                case 2: System.out.print("The popped element is :");
                        stk.pop();
                        break;
                case 3: System.out.print("The topmost element in the stack is :");
                        stk.peek();
                        break;
                case 4: System.out.println("The elements inside the stack are : ");
                        stk.display();
                        break;
                case 5: sc.close();
                        System.exit(0);
            }
        }
    }
}