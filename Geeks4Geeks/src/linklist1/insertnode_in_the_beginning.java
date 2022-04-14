package linklist1;

class Node{
	int data;
	Node  next;
	public Node(int x) {
		data=x;
		next=null;
	}
}
public class insertnode_in_the_beginning {

	public static void main(String[] args) {
		 Node head=null;
		 head=insertBegin(head,30);
		 head=insertBegin(head,40);
		 head=insertBegin(head,50);
		 head=insertBegin(head,60);
   show(head);
	}

	public static void show(Node head) {
		// TODO Auto-generated method stub
		Node curr=head;
		if(head==null) {
			System.out.println("The list is empty");
		}
		while(curr!=null) {
			System.out.print(curr.data +"   ");
			curr=curr.next;
		}
	}

	public static Node insertBegin(Node head, int x) {
		// TODO Auto-generated method stub
		Node  temp= new Node(x);
		temp.next=head;
		head =temp;
		return head;
	}

}
