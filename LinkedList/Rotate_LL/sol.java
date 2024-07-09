package Rotate_LL;

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
    public static Node rotate(Node head, int k){
        if(head == null||head.next == null||k == 0) return head;

        Node temp = head;
        int length = 1;

        while(temp.next != null) {
            length++;
            temp = temp.next;
        }

        temp.next = head;
        k = k%length;
        int end = length-k;

        while(end--!=0) temp = temp.next;

        head = temp.next;
        temp.next = null;
        return head;
    }
    public static void printLL(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);
        list1.next.next = new Node(7);
        list1.next.next = new Node(9);

        int k = 2;

        Node ans = rotate(list1,k);
        printLL(ans);
    }
}
