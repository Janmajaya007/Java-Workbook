package linklist1;

class noder{
	   int data; 
	   noder next;
	   
	    noder(int x){
		   this.data=x;
		   this.next=null;
	   }
}

public class delet_node_from_begining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		noder head=null;
		head=insertEnd(head,10);
		head=insertEnd(head,20);
		head=insertEnd(head,30);
		head=insertEnd(head,40);
		head=insertEnd(head,50);
		System.out.println("The Linklist before Deletion");
		Show(head);
		System.out.println();
		System.out.println( );

		System.out.println("The Linklist after deletion from begining");
		noder xor=deletfrombegin(head);
		Show(xor);
		System.out.println();
		System.out.println( );

		
		System.out.println("The Linklist after deletion from end");
		noder xnor=deletfromend(head);
		Show(xnor);
		
	}

	public static noder deletfromend(noder head) {
		// TODO Auto-generated method stub
		
		if(head==null) {
			return null;
		}
		if(head.next==null) {
			return null;
		}
		noder curr=head;
		while(curr.next.next!=null) 
			curr=curr.next;
			curr.next=null;
		
		return head;
	}

	public static noder deletfrombegin(noder head) {
		// TODO Auto-generated method stub
		if(head==null) {
			return  null;
		}
		else {
		return head.next;
		}
	}

	private static void Show(noder head) {
		// TODO Auto-generated method stub
		noder curr=head;
		if(head==null) {
			System.out.println("The list is empty");
		}
		while(curr!=null) {
			System.out.print(curr.data +"   ");
			curr=curr.next;
		}
	} 
	private static noder insertEnd(noder head, int i) {
		// TODO Auto-generated method stub
		noder temp=new noder(i);
		
		if(head==null) {
			 return temp;
		}
		noder curr= head;
		while(curr.next!=null) { 
			curr=curr.next;}
			curr.next=temp;
		
		return head;
	}

}
