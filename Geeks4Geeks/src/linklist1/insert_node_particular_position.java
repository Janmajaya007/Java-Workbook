package linklist1;

class node2{
	   int data; 
	   node2 next;
	   
	    node2(int x){
		   this.data=x;
		   this.next=null;
	   }
}

public class insert_node_particular_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node2 head=null;
		head=insertEnd(head,10);
		head=insertEnd(head,20);
		head=insertEnd(head,30);
		head=insertEnd(head,40);
		head=insertEnd(head,50);
		System.out.println("The Given Linklist is following");
		Show(head);
		System.out.println();
		System.out.println();
		System.out.println("The updated Linklist is following");
		node2 newlist=insert(head,90, 3);
		 Show(newlist);
	}

	public static node2 insert(node2 head, int i, int j) {
		// TODO Auto-generated method stub
		node2 temp=new  node2(i);
		if(j==1) {
			temp.next=head;
			return temp;
		}
		node2 curr=head;
		for(int k=0;k<j-2 && curr!=null;k++) {
			curr=curr.next;
		}
		if(curr==null) {
			return head;
		}
		temp.next=curr.next;
		curr.next=temp;
		return head;
		
	}

	private static void Show(node2 head) {
		// TODO Auto-generated method stub
		node2 curr=head;
		if(head==null) {
			System.out.println("The list is empty");
		}
		while(curr!=null) {
			System.out.print(curr.data +"   ");
			curr=curr.next;
		}
	}

	public static node2 insertEnd(node2 head, int i) {
		// TODO Auto-generated method stub
node2 temp=new node2(i);
		
		if(head==null) {
			 return temp;
		}
		node2 curr= head;
		while(curr.next!=null) { 
			curr=curr.next;}
			curr.next=temp;
		
		return head;
	}

}
