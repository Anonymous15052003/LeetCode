package Delete_nodes_which_have_greater_value_on_right_side;

public class MaxReverse {
    Node head; 

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Deletes nodes which have a node with greater value node on the right side */
    void delLesserNodes() {
        // Step 1: Reverse the linked list
        head = reverseList(head);

        // Step 2: Delete nodes which have a node with greater value node on the left side
        head = _delLesserNodes(head);

        // Step 3: Reverse the linked list again to retain the original order
        head = reverseList(head);
    }

    /* Deletes nodes which have greater value node(s) on the left side */
    Node _delLesserNodes(Node head) {
        Node current = head;
        Node maxNode = head;

        while (current != null && current.next != null) {
            if (current.next.data < maxNode.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
                maxNode = current;
            }
        }
        return head;
    }

    /* Function to reverse the linked list */
    Node reverseList(Node head) {
        Node current = head;
        Node prev = null;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    /* Inserts a new Node at front of the list */
    void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        MaxReverse llist = new MaxReverse();

        // Constructed Linked List is 12->15->10->11->5->6->2->3
        llist.push(3);
        llist.push(2);
        llist.push(6);
        llist.push(5);
        llist.push(11);
        llist.push(10);
        llist.push(15);
        llist.push(12);

        System.out.println("Given Linked List");
        llist.printList();

        llist.delLesserNodes();

        System.out.println("Modified Linked List");
        llist.printList();
    }
}
