package Training;

import java.util.Scanner;

public class ArrayQueue {
    static int [] queue;
    static int front;
    static int rear;
    static int maxSize;

    ArrayQueue(int size){
        maxSize = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    static void enqueue(int ele){
        if (rear==queue.length-1){
            System.out.println("Queue Overflow");
            return;
        }
        else if (front==-1 && rear==-1){
            front++;
            rear++;
        }
        else{
            rear = (rear + 1) % maxSize;
        }
        queue[rear] = ele;
    }

    static void dequeue(){
        if (front==-1){
            System.out.println("Queue underflow");
            return;
        }
        else if (front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front = (front + 1) % maxSize;
        }
    }

    static void display(){
        if (front==-1){
            System.out.println("Queue is empty");
            return;
        }
        else{
            for (int i=front;i<=rear;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int size = sc.nextInt();

        QueueArray q = new QueueArray(size);

        while (true){
            System.out.println("1. Enqueue element in queue");
			System.out.println("2. Dequeue element from queue");
			System.out.println("3. Display the queu");
			System.out.println("4. Exit");
			
			System.out.print("Select your option: ");
			int ch = sc.nextInt();

            switch (ch) {
                case 1: System.out.println("Enter element : ");
                        int ele = sc.nextInt();
                        enqueue(ele);
                        break;
                case 2: dequeue();
                        break;
                case 3: display();
                        break;
                case 4: sc.close();
                        System.exit(0);
            }
        }
    }
}