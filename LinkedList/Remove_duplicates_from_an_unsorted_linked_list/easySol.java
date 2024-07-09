package Remove_duplicates_from_an_unsorted_linked_list;

import java.util.*;

class Node {
    int val;
    Node next;
    public Node(int val){
        this.val=val;
        this.next = null;
    }
    public Node(int val,Node next){
        this.val = val;
        this.next = next;
    }
}

public class easySol {
    public static void removeDuplicate(Node head){
        Node temp = head;
        Node prev = null;
        HashSet<Integer> hash = new HashSet<>();

        while (temp!=null){
            if (hash.contains(temp.val)){
                prev.next = temp.next;
            }
            else{
                hash.add(temp.val);
                prev = temp;
            }
            temp = temp.next;
        }
    }
    public static void printList(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Node start = new Node(10);
        start.next = new Node(12);
        start.next.next = new Node(11);
        start.next.next.next = new Node(11);
        start.next.next.next.next = new Node(12);
        start.next.next.next.next.next = new Node(11);
        start.next.next.next.next.next.next = new Node(10);

        System.out.println("Linked list before removing duplicates :");
        printList(start);

        removeDuplicate(start);

        System.out.println("\nLinked list after removing duplicates :");
        printList(start);
    }
}