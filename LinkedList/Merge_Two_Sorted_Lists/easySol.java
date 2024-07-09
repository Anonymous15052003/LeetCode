package Merge_Two_Sorted_Lists;

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

public class easySol {
    public static Node sortTwoLinkedLists(Node list1, Node list2){
        Node node = new Node(-1);
        Node dummy = node;

        while (list1!=null && list2!=null){
            if (list1.val<list2.val){
                dummy.next = list1;
                list1 = list1.next;
            }
            else{
                dummy.next = list2;
                list2 = list2.next;
            }
            dummy=dummy.next;
        }
        if (list1!=null) {
            dummy.next = list1;
        }
        else {
            dummy.next = list2;
        }

        return node.next;
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