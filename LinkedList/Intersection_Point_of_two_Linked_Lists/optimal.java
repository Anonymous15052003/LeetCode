package Intersection_Point_of_two_Linked_Lists;

class Node {
        int num;
        Node next;
        Node(int val) {
            num = val;
            next = null;
        }
}

public class optimal{
    static Node insertNode(Node head,int val) {
        Node newNode = new Node(val);
        
        if(head == null) {
            head = newNode;
            return head;
        }
        
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        
        temp.next = newNode;
        return head;
    }
    
    static Node intersectionPresent(Node head1,Node head2) {
        Node d1 = head1;
        Node d2 = head2;
        
        while (d1 != d2) {
            if (d1 == null) {
                d1 = head2;
            } 
            else {
                d1 = d1.next;
            }

            if (d2 == null) {
                d2 = head1;
            } 
            else {
                d2 = d2.next;
            }
        }
        
        return d1;
    }

    static void printList(Node head) {
        while(head.next != null) {
        System.out.print(head.num+"->");
            head = head.next;
        }
        System.out.println(head.num);
    }

    public static void main(String args[]) {
        Node head = null;
        head=insertNode(head,1);
        head=insertNode(head,3);
        head=insertNode(head,1);
        head=insertNode(head,2);
        head=insertNode(head,4);

        Node head1 = head;
        head = head.next.next.next;

        Node headSec = null;
        headSec=insertNode(headSec,3);

        Node head2 = headSec;
        headSec.next = head;
        
        System.out.print("List1: "); printList(head1);
        System.out.print("List2: "); printList(head2);
        
        Node answerNode = intersectionPresent(head1,head2);

        if(answerNode == null)  
            System.out.println("No intersection\n");
        else
            System.out.println("The intersection point is "+answerNode.num);
        
    }
}