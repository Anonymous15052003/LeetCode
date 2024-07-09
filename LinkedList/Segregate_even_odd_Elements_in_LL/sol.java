package Segregate_even_odd_Elements_in_LL;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class sol {
    public static ListNode oddEvenList(ListNode head){
        if (head==null) return null;

        ListNode oddDummy = new ListNode(0);
        ListNode evenDummy = new ListNode(0);
        ListNode odd = oddDummy;
        ListNode even = evenDummy;

        ListNode curr = head;

        while (curr!=null){
            if (curr.val%2!=0){
                odd.next = curr;
                odd = odd.next;
            }
            else{
                even.next = curr;
                even = even.next;
            }
            curr = curr.next;
        }

        even.next = null;
        odd.next = evenDummy.next;

        return oddDummy.next;
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