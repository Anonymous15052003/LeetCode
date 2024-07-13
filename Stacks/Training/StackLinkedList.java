package Training;

import java.util.Scanner;
public class StackLinkedList {
		class Node{
		int data;
		Node next;
		public Node(int d) {
			this.data=d;
			this.next=null;
		}
	}
	Node top=null;
	
	//Insert at front  as push function   
	public void addFirst(int new_data) { 
		Node new_node=new Node(new_data); 
		new_node.next = top;// Copy Current head to next of new Node as head 
		top = new_node;                	//Move the head to point to new Node 
	}
	
	//remove front  as pop function   
	public void removeFirst() { 
		if(top==null) {
			System.out.println("Stack Underflow");
		}
		else {
			System.out.println("The popped item is "+top.data);
			top = top.next;                	//Move the head to point to new Node
		}
	}
	
	//display front  as peek function   
    public void peek() { 
        if(top==null) {
            System.out.println("Stack Underflow");
        }
        else {
            System.out.println("The peeked item is "+top.data);
        }	 
    }
    
    //Display stack
    public void display(StackLinkedList List) {
        Node curr=top;
        if(top==null) {
            System.out.print("Empty List");
            return;
        }
        while(curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }	
        System.out.println();
    }
	

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		StackLinkedList st=new StackLinkedList();
		
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
				    st.addFirst(ele);
				    break;
				    
			case 2: st.removeFirst();
					break;
			
			case 3: st.display(st);
				    break;
			case 4: st.peek();
		    		break;
			
			case 5: input.close();
                    System.exit(0);
			}
		}

	}

}