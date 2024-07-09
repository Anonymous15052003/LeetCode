package Remove_nth_node_from_end_of_list;

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

class Solution {

    static int length(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        int len = length(head);
        ListNode node = head;
        int pos = 1;
        while (pos < len - n) {
            node = node.next;
            pos++;
        }

        if (len == n)
            head = head.next;

        else if (node.next == null)
            return null;

        else
            node.next = node.next.next;

        return head;
    }
    
    public static void printLinkedList(ListNode head){
        ListNode temp = head;

        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode start = new ListNode(1);
        start.next = new ListNode(2);
        start.next.next = new ListNode(3);
        start.next.next.next = new ListNode(4);
        start.next.next.next.next = new ListNode(5);

        int k = 2;

        ListNode res = removeNthFromEnd(start,k);
        printLinkedList(res);
    }
}