package linklist1;
class Node_list {
	int data;
	Node_list next;
	Node_list(int d) {
		data = d;
		next = null;
	}
}
class _1_linkedList_ {
	public static void main(String[] args) {
		Node_list head = new Node_list(85);
		head.next = new Node_list(15);
		head.next.next = new Node_list(4);
		head.next.next.next = new Node_list(20);
		System.out.println("Given Linked list");
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}
