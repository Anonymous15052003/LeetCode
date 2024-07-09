package Add_Two_Numbers;

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

public class sol {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;

        while (l1!=null || l2!=null || carry==1){
            int sum = 0;

            if (l1!=null){
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2!=null){
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
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
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        ListNode mergedList = addTwoNumbers(list1, list2);

        System.out.print("Merged sorted linked list: ");
        printLinkedList(mergedList);
    }
}
