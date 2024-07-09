package LinkedList_Learning;

public class DLL {
    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val = val;
        }
        
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    Node head;
    Node tail;
    private int size;

    public DLL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head!=null){
            head.prev = node;
        }
        head = node;
        
        size++;
    }

    public void display(){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse(){
        Node temp = head;
        Node last = null;

        while (temp!=null){
            last = temp;
            temp=temp.next;
        }

        while (last!=null){
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
}
