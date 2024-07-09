package Sort_linked_list_of_0s_1s_2s;

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

public class sol {
    public static Node sorting(Node head){
        int [] count = {0,0,0};

        Node temp = head;

        while (temp!=null){
            count[temp.val]++;
            temp = temp.next;
        }

        int i = 0;

        temp = head;

        while (temp!=null){
            if (count[i]==0){
                i++;
            }
            else{
                temp.val = i;
                count[i]--;
            }
            temp = temp.next;
        }
        return head;
    }
    static void printList(Node head)
    {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node start = new Node(0);
        start.next = new Node(1);
        start.next.next = new Node(0);
        start.next.next.next = new Node(2);
        start.next.next.next.next = new Node(1);
        start.next.next.next.next.next = new Node(1);
        start.next.next.next.next.next.next = new Node(2);
        start.next.next.next.next.next.next.next = new Node(1);
        start.next.next.next.next.next.next.next.next = new Node(2);

        Node res = sorting(start);
        printList(res);
    }
}
