package Remove_duplicates_from_an_unsorted_linked_list_II;

import java.util.*;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}

public class easySol {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Map<Integer, Integer> set = new HashMap<Integer, Integer>();
        ListNode temp = head;
        while (temp != null) {
            set.put(temp.val,set.getOrDefault(temp.val, 0)+1);
            temp = temp.next;
        }
        temp = head;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        while (temp != null) {
            if (set.get(temp.val) == 1) {
                prev.next = temp;
                prev = prev.next;
            }
            temp = temp.next;
        }
        prev.next = null;
        return dummy.next;
    }
    public static void printList(ListNode head){
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        /* The constructed linked list is:
         10->12->11->11->12->11->10*/
        ListNode start = new ListNode(1);
        start.next = new ListNode(2);
        start.next.next = new ListNode(3);
        start.next.next.next = new ListNode(3);
        start.next.next.next.next = new ListNode(4);
        start.next.next.next.next.next = new ListNode(4);
        start.next.next.next.next.next.next = new ListNode(5);

        System.out.println("Linked list before removing duplicates :");
        printList(start);

        ListNode ans = deleteDuplicates(start);

        System.out.println("\nLinked list after removing duplicates :");
        printList(ans);
    }
}