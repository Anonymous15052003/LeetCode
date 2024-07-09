package Delete_nodes_which_have_greater_value_on_right_side;

class Node {
	
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}

class LLUtil{
	public Node createLL(int[] arr){
		
		Node head = new Node(arr[0]);
		Node temp = head;
		
		Node newNode = null;
		for(int i = 1; i < arr.length; i++){
			newNode = new Node(arr[i]);
			temp.next = newNode;
			temp = temp.next;
		}
		return head;
	}

	public void printLL(Node head){
		
		while(head != null){
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
}

class GFG {
    public static Node deleteNodesOnRightSide(Node head){
		if(head == null || head.next == null) return head;
		Node nextNode = deleteNodesOnRightSide(head.next);

		if(nextNode.data > head.data) return nextNode;
		head.next = nextNode;

		return head;
	}

	public static void main (String[] args) {
		
		int[] arr = {12,15,10,11,5,6,2,3};
		LLUtil llu = new LLUtil();
		Node head = llu.createLL(arr);
		System.out.println("Given Linked List");
		llu.printLL(head);
		head = deleteNodesOnRightSide(head);
		System.out.println("Modified Linked List");
		llu.printLL(head);
	}
}