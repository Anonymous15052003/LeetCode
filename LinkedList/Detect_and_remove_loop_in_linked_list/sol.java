package Detect_and_remove_loop_in_linked_list;

import java.util.HashSet;

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
    public static void removeLoop(Node head){
        HashSet<Node> set = new HashSet<>();
        Node prev = null;

        while (head!=null){
            if (set.contains(head)){
                prev.next = null;
                return;
            }
            else{
                set.add(head);
                prev = head;
            }
            head = head.next;
        }
    }
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Node llist = new Node(50);
        llist.next = new Node(20);
        llist.next.next = new Node(15);
        llist.next.next.next = new Node(4);
        llist.next.next.next.next = new Node(10);
        llist.next.next.next.next.next= llist.next.next;

        removeLoop(llist);
        System.out.println("Linked List after removing loop");
        printLinkedList(llist);
    }
}