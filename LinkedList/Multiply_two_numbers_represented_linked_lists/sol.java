package Multiply_two_numbers_represented_linked_lists;

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

public class sol {
    public static void main(String[] args) {
        Node start = new Node(9);
        start.next = new Node(4);
        start.next.next = new Node(6);

        Node end = new Node(9);
        end.next = new Node(9);

        
    }
}