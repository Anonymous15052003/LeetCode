package Flatten_LL_with_next_and_child_pointers;
                                
class Node {
    int data;
    Node next;
    Node child;

    Node() {
        this.data = 0;
        this.next = null;
        this.child = null;
    }

    Node(int x) {
        this.data = x;
        this.next = null;
        this.child = null;
    }

    Node(int x, Node nextNode, Node childNode) {
        this.data = x;
        this.next = nextNode;
        this.child = childNode;
    }
}

public class optimal {
    public static Node merge(Node list1, Node list2) {
        Node dummyNode = new Node(-1);
        Node res = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                res.child = list1;
                res = list1;
                list1 = list1.child;
            } else {
                res.child = list2;
                res = list2;
                list2 = list2.child;
            }
            res.next = null;
        }

        if (list1 != null) {
            res.child = list1;
        } else {
            res.child = list2;
        }

        if (dummyNode.child != null) {
            dummyNode.child.next = null;
        }

        return dummyNode.child;
    }

    public static Node flattenLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mergedHead = flattenLinkedList(head.next);
        head = merge(head, mergedHead);
        return head;
    }

    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.child;
        }
        System.out.println();
    }

    public static void printOriginalLinkedList(Node head, int depth) {
        while (head != null) {
            System.out.print(head.data);

            if (head.child != null) {
                System.out.print(" -> ");
                printOriginalLinkedList(head.child, depth + 1);
            }

            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < depth; ++i) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.child = new Node(14);

        head.next = new Node(10);
        head.next.child = new Node(4);

        head.next.next = new Node(12);
        head.next.next.child = new Node(20);
        head.next.next.child.child = new Node(13);

        head.next.next.next = new Node(7);
        head.next.next.next.child = new Node(17);

        System.out.println("Original linked list:");
        printOriginalLinkedList(head, 0);

        Node flattened = flattenLinkedList(head);
        System.out.print("\nFlattened linked list: ");
        printLinkedList(flattened);
    }
}