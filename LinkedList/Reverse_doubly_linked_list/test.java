package Reverse_doubly_linked_list;

public class test {
    public static Node reverseDLL(Node head){
        Node curr = head;
        Node temp = null;

        while (curr!=null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if (temp!=null){
            head = temp.prev;
        }
        return head;
    }
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.prev = list1;
        list1.next.next = new Node(5);
        list1.next.next.prev = list1.next;

        Node ans = reverseDLL(list1);
        printLL(ans);
    }
}
