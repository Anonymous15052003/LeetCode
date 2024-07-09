package Merge_Two_Sorted_Lists;

import java.util.*;

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

public class bruteforce {
    public static Node convertToLL(ArrayList <Integer> ans){
        Node node = new Node(-1);
        Node temp = node;

        for (int i=0;i<ans.size();i++){
            temp.next = new Node(ans.get(i));
            temp=temp.next;
        }
        return node.next;
    }
    public static Node sortTwoLinkedLists(Node list1, Node list2){
        Node temp1 = list1;
        Node temp2 = list2;

        ArrayList<Integer> ans = new ArrayList<>();

        while (temp1!=null){
            ans.add(temp1.val);
            temp1=temp1.next;
        }

        while (temp2!=null){
            ans.add(temp2.val);
            temp2=temp2.next;
        }

        Collections.sort(ans);

        Node head = convertToLL(ans);

        return head;
    }
    public static void printLinkedList(Node head){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Example Linked Lists
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        System.out.print("First sorted linked list: ");
        printLinkedList(list1);

        System.out.print("Second sorted linked list: ");
        printLinkedList(list2);

        Node mergedList = sortTwoLinkedLists(list1, list2);

        System.out.print("Merged sorted linked list: ");
        printLinkedList(mergedList);
    }
}
