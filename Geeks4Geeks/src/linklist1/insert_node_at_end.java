package linklist1;
class node{
	   int data; 
	   node next;
	    node(int x){
		   this.data=x;
		   this.next=null;
	   }
}
public class insert_node_at_end {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
node head=null;
head=insertEnd(head,10);
head=insertEnd(head,20);
head=insertEnd(head,30);
head=insertEnd(head,40);
head=insertEnd(head,50);
Show(head);
	}
	private static void Show(node head) {
		node curr=head;
		if(head==null) {
			System.out.println("The list is empty");
		}
		while(curr!=null) {
			System.out.print(curr.data +"   ");
			curr=curr.next;
		}
	} 
	private static node insertEnd(node head, int i) {
		node temp=new node(i);	
		if(head==null) {
			 return temp;
			 }
		node curr= head;
		while(curr.next!=null) { 
			curr=curr.next;}
			curr.next=temp;
		return head;
	}}
