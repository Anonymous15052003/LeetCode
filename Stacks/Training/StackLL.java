package Training;

import java.util.Scanner;

public class StackLL {
    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    Node head = null;

    void addFirst(int new_data){
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }

    void deleteFirst(){
        if (head==null){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.println("Poped item is : "+head.val);
            head = head.next;
        }
    }

    void peek(){
        if (head==null){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.println(head.val);
        }
    }

    void display(){
        if (head==null){
            System.out.println("Stack Underflow");
        }
        else{
            Node curr = head;
            while (curr!=null){
                System.out.println(curr.val);
                curr = curr.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StackLL stk = new StackLL();

        while (true){
            System.out.println("1. Push element in stack");
			System.out.println("2. Pop an element from Stack");
			System.out.println("3. Display the Stack");
			System.out.println("4. Peek the top element");
			System.out.println("5. Exit");
			System.out.print("Select your option: ");
			int ch = sc.nextInt();

            switch(ch){
                case 1: System.out.println("Enter the element to push : ");
                        int ele = sc.nextInt();
                        stk.addFirst(ele);
                        break;
                case 2: stk.deleteFirst();
                        break;
                case 3: stk.display();
                        break;
                case 4: stk.peek();;
                        break;
                case 5: sc.close();
                        System.exit(0);
            }
        }
    }

}