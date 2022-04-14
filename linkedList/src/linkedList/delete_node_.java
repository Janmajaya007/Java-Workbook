package linkedList;

import linkedList.inserting_a_node.Node;

public class delete_node_ {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		delete_node_ list = new delete_node_();
		list.append(10);
		list.append(20);
		list.append(30);
		list.append(40);
		list.append(50);
		list.append(60);
		list.printlist();
		System.out.println();
		list.delete(30);
		list.printlist();
	}

	private void delete(int key) {
		// TODO Auto-generated method stub
		Node temp=head;
		Node prev=null;
		
		if(temp!=null && temp.data==key) {
			head=temp.next;
			return;
		}
		
		while(temp!=null && temp.data!=key) {
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)
			return;
		
		prev.next=temp.next;
	}

	private void printlist() {
		// TODO Auto-generated method stub
		Node n=head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	private void append(int i) {
		// TODO Auto-generated method stub
		Node end = new Node(i);
		if (head == null) {
			head = new Node(i);
			return;
		}
		end.next = null;
		Node point = head;
		while (point.next != null)
			point = point.next;

		point.next = end;
		return;
	}
}
