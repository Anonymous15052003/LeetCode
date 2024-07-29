package Training;

import java.util.Scanner;

public class QueueArray {
	
	int queue[];
	int front;
	int rear;
	
	QueueArray(int size){
		queue=new int[size];
		front=-1;
		rear=-1;
	}
	
	void enqueue(int ele) {
		System.out.println("Before Enqueue Front= "+front+" rear= "+rear);
		if(rear==queue.length-1) {
			System.out.println("Queue Overflow");
			return;
		}
		else if(front==-1&&rear==-1) {
			front++;
			rear++;
		}
		else {
			rear++;
		}
			queue[rear]=ele;
			System.out.println("After Enqueue Front= "+front+" rear= "+rear);
	}
	
	void dequeue() {
		System.out.println("Before Dequeue Front= "+front+" rear= "+rear);
		if(front==-1) {
			System.out.println("Underflow");
			return;
		}
		System.out.println("The deleted item is"+queue[front]);
		if(front==rear){
			front=rear=-1;
		}
		else {
			front++;
		}
		System.out.println("After Dequeue Front= "+front+" rear= "+rear);
	}
	
	void display() {
		if(front==-1) {
			System.out.println("Queue Underflow");
		}
		else {
			for(int i=front;i<=rear;i++) {
				System.out.println(queue[i]+" ");
			}
		}
	}


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the size of queue");
		int size=input.nextInt();
		
		
		QueueArray q=new QueueArray(size);
		
		while(true)
		{
			System.out.println("1. Enqueue element in queue");
			System.out.println("2. Dequeue element from queue");
			System.out.println("3. Display the queu");
			System.out.println("4. Exit");
			
			System.out.print("Select your option: ");
			int ch = input.nextInt();
			
			switch(ch)
			{
			case 1: System.out.print("Enter the element to enqueue: ");
				    int ele = input.nextInt();
				    q.enqueue(ele);
				    break;
				    
			case 2: q.dequeue();
					break;
			
			case 3: q.display();
				    break;

			case 4: input.close();
					System.exit(0);
			}
		}

	}
}