package Length_of_LL;

class Node{
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
    public static int lengthy(Node head){
        Node temp = head;
        int count = 0;

        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        int ans = lengthy(list1);
        System.out.println(ans);
    }
}