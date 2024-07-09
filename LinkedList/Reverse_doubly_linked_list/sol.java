package Reverse_doubly_linked_list;

class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

public class sol {
    public static Node reverseDLL(Node head) {
        Node temp = null;
        Node current = head;

        // Swap next and prev for all nodes of the doubly linked list
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        // Before changing the head, check for the cases like empty list and list with only one node
        if (temp != null) {
            head = temp.prev;
        }
        return head;
    }

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.prev = list1;
        list1.next.next = new Node(5);
        list1.next.next.prev = list1.next;

        Node ans = reverseDLL(list1);
        printLL(ans);
    }
}
