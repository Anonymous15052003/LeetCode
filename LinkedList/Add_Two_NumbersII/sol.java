package Add_Two_NumbersII;

class ListNode {
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

public class sol {
    public static ListNode reverseList(ListNode head){
        ListNode temp = head;
        ListNode prev = null;

        while (temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode r1 = reverseList(l1);
        ListNode r2 = reverseList(l2);
        
        ListNode head1 = r1;
        ListNode head2 = r2;

        ListNode res = new ListNode(-1);
        ListNode temp = res;

        int carry = 0;

        while (head1!=null || head2!=null || carry==1){
            int sum = 0;
            if (head1!=null){
                sum += head1.val;
                head1 = head1.next;
            }
            if (head2!=null){
                sum += head2.val;
                head2 = head2.next;
            }

            sum += carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
        }

        ListNode ans = reverseList(res.next);
        return ans;
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
        ListNode list1 = new ListNode(7);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        list1.next.next.next = new ListNode(3);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);

        ListNode mergedList = addTwoNumbers(list1, list2);

        System.out.print("Merged sorted linked list: ");
        printLinkedList(mergedList);
    }
}