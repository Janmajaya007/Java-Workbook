  package linklist1;

class Nodee{
	int data;
	Nodee next;
	Nodee(int x){
		data=x;
		next =null;
	}
}
 class simple_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodee head=new Nodee(10);
		head.next=new Nodee(20);
		head.next.next=new Nodee(30);
		head.next.next.next=new Nodee(40);
		print(head);
			}

			public static void print(Nodee head) {
				// TODO Auto-generated method stub
				Nodee curr=head;
				while(curr!=null) {
					System.out.print(curr.data+ "  ");
					curr=curr.next;
				}
	}

}
