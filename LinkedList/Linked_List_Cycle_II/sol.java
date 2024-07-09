package Linked_List_Cycle_II;

class ListNode{
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

public class sol {
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast)break;
        }
        
        if (fast==null || fast.next==null)return null;

        while (head!=slow){
            head= head.next;
            slow = slow.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode start = new ListNode(3);
        start.next = new ListNode(2);
        start.next.next = new ListNode(0);
        start.next.next.next = new ListNode(-4);
        start.next.next.next.next = start.next;

        ListNode ans = detectCycle(start);

        if (ans != null) {
            System.out.println("Cycle detected at node with value: " + ans.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}