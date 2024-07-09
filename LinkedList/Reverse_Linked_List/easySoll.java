package Reverse_Linked_List;

class Node {
    int val;
    Node next;

    public Node(int val){
        this.val = val;
        this.next = null;
    }

    public Node(int val,Node next){
        this.val = val;
        this.next = next;
    }
}

public class easySoll {
    public static Node reverseLinkedList(Node head){
        Node temp = head;
        Node prev = null;

        while (temp!=null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static void printLinkedList(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list
        head = reverseLinkedList(head);

        // Print the reversed linked list
        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }
}