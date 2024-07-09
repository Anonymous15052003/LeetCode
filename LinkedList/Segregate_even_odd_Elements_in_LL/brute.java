package Segregate_even_odd_Elements_in_LL;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class brute {
    public static ListNode oddEvenList(ListNode head){
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            arr.add(temp.val);
            if (temp.next != null) {
                temp = temp.next.next;
            } else {
                break;
            }
        }

        temp = head.next;

        while (temp != null) {
            arr.add(temp.val);
            if (temp.next != null) {
                temp = temp.next.next;
            } else {
                break;
            }
        }

        temp = head;

        for (int i=0;i<arr.size();i++){
            temp.val = arr.get(i);
            temp = temp.next;
        }
        return head;
    }
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = oddEvenList(head);

        printList(result); // Should print: 1 3 5 2 4
    }
}
