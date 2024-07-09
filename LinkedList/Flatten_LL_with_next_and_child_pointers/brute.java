package Flatten_LL_with_next_and_child_pointers;

import java.util.*;

class Node {
    int data;
    Node next;
    Node child;

    Node() {
        data = 0;
        next = null;
        child = null;
    }

    Node(int x) {
        data = x;
        next = null;
        child = null;
    }

    Node(int x, Node nextNode, Node childNode) {
        data = x;
        next = nextNode;
        child = childNode;
    }
}

public class brute {
    static Node convertArrToLinkedList(ArrayList<Integer> arr) {
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        for (int i = 0; i < arr.size(); i++) {
            temp.child = new Node(arr.get(i));
            temp = temp.child;
        }
        return dummyNode.child;
    }

    static Node flattenLinkedList(Node head) {
        ArrayList<Integer> arr = new ArrayList<>();

        while (head != null) {
            Node t2 = head;
            while (t2 != null) {
                arr.add(t2.data);
                t2 = t2.child;
            }
            head = head.next;
        }

        Collections.sort(arr);

        return convertArrToLinkedList(arr);
    }

    static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.child;
        }
        System.out.println();
    }

    static void printOriginalLinkedList(Node head, int depth) {
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
        
        System.out.println("\nFlattened linked list: ");
        printLinkedList(flattened);
    }
}