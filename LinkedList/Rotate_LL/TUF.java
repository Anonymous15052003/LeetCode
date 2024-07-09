package Rotate_LL;

class Node {
    int val;
    Node next;
    Node(int a) {
        val = a;
        next = null;
    }
}

class TUF {
    static Node insertNode(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        
        temp.next = newNode;
        return head;
    }

    static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        Node temp = head;
        int length = 1;
        while (temp.next != null) {
            ++length;
            temp = temp.next;
        }

        temp.next = head;
        k = k % length; 
        int end = length - k;
        temp = head;  
        while (end-- > 1) temp = temp.next;

        head = temp.next;
        temp.next = null;

        return head;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            if (temp.next != null) {
                System.out.print(temp.val + "->");
            } else {
                System.out.print(temp.val);
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;
        // Inserting Node
        head = insertNode(head, 1);
        head = insertNode(head, 2);
        head = insertNode(head, 3);
        head = insertNode(head, 4);
        head = insertNode(head, 5);

        System.out.println("Original list: ");
        printList(head);

        int k = 2;
        Node newHead = rotateRight(head, k); // Calling function for rotating right of the nodes by k times

        System.out.println("After " + k + " iterations: ");
        printList(newHead); // List after rotating nodes
    }
}
