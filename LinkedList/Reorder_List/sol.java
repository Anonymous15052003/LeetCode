package Reorder_List;

class Node{
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

public class sol {
    public static void reverseLinkedList(Node head){
        if (head==null || head.next==null)return;

        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node next = null;
        Node prev = null;

        while (slow!=null){
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        Node firstHalf = head;
        Node secondHalf = prev;

        while (secondHalf.next!=null){
            next = firstHalf.next;
            prev = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = next;

            firstHalf = next;
            secondHalf = prev;
        }
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
        reverseLinkedList(head);

        // Print the reversed linked list
        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }
}
