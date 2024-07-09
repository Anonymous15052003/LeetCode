package Segregate_even_odd_Elements_in_LL;

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

public class optimal {
    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return head;
        if (head.next == null) return head;
        if (head.next.next == null) return head;

        ListNode odd = head, even = head.next;
        ListNode evenHead = head.next;

        while (even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
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
