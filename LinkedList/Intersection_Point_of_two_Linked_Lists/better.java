package Intersection_Point_of_two_Linked_Lists;

class Node {
        int num;
        Node next;
        Node(int val) {
            num = val;
            next = null;
        }
}

public class better{
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

    static int getDifference(Node head1,Node head2) {
        int len1 = 0,len2 = 0;
            while(head1 != null || head2 != null) {
                if(head1 != null) {
                    len1++; 
                    head1 = head1.next;
                }
                if(head2 != null) {
                    len2++; 
                    head2 = head2.next;
                }
                
            }
            return len1-len2;//if difference is neg-> length of list2 > length of list1 else vice-versa
    }

    static Node intersectionPresent(Node head1,Node head2) {
        int diff = getDifference(head1,head2);
        if(diff < 0) 
            while(diff++ != 0) head2 = head2.next; 
        else while(diff-- != 0) head1 = head1.next;
        while(head1 != null) {
            if(head1 == head2) return head1;
            head2 = head2.next;
            head1 = head1.next;
        }
        return head1;
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
        
        System.out.print("List1: "); 
        printList(head1);
        System.out.print("List2: "); 
        printList(head2);
        
        Node answerNode = intersectionPresent(head1,head2);

        if(answerNode == null)  
            System.out.println("No intersection\n");
        else
            System.out.println("The intersection point is "+answerNode.num);
    }
}