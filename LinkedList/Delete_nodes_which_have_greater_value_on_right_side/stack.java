package Delete_nodes_which_have_greater_value_on_right_side;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class stack {
    public static ListNode removeNodes(ListNode head){
        Stack<ListNode> stk = new Stack<>();
        ListNode temp = head;

        while (temp!=null){
            while (!stk.isEmpty() && stk.peek().val<temp.val){
                stk.pop();
            }
            stk.push(temp);
            temp = temp.next;
        }

        ListNode store = null;
        while (!stk.isEmpty()){
            temp = stk.pop();
            temp.next = store;
            store = temp; 
        }
        return temp;
    }
    public static void printLinkedList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(4);

        ListNode result = removeNodes(head);

        System.out.print("Resulting linked list: ");
        printLinkedList(result);
    }
}