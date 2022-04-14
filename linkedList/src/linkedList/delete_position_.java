package linkedList;

import linkedList.delete_node_.Node;

public class delete_position_ {
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
		delete_position_ list = new delete_position_();
		list.append(10);
		list.append(20);
		list.append(30);
		list.append(40);
		list.append(50);
		list.append(60);
		list.printlist();
		System.out.println();
		list.deletePosition(3);
		 
		list.printlist();
		System.out.println();
		list.deletePosition(4);
		list.printlist();
	}

	private void deletePosition(int position) {
		// TODO Auto-generated method stub
		if(head==null)
			return;
		
		Node temp=head;
		
		if(position==0)
		{
			head=temp.next;
			return;
		}
		
		for(int i=0;temp!=null && i<position-1;i++)
		{
			temp=temp.next;
		}
		
		if(temp==null || temp.next==null)
			return;
		
		Node next_=temp.next.next;
		temp.next=next_;
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


