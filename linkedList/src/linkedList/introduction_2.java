package linkedList;

  class introduction_2 {
   static Node head;
   //Node num;
   //static int number;
   static class Node{
	   int data;
	   Node next;
	   Node(int data){
		   this.data=data;
	   }
   }
	public static void main(String[] args) {
		introduction_2 list=new introduction_2();
//		 list.num=new Node(23); 
//		 introduction_2.number=10;
//		 System.out.println(number);
//		 System.out.println(list.num.data);
//		 System.out.println(list.num.next);
		 list.head=new Node(10);
		 Node second =new Node(20);
		 Node third=new Node(30);
		 /* Three nodes have been allocated dynamically.
         We have references to these three blocks as head, 
         second and third

         list.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 10  | null |     | 20  | null |     |  30 | null |
        +----+------+     +----+------+     +----+------+ */

		 list.head.next=second;
		 /*  Now next of the first Node refers to the second.  So they
         both are linked.

      llist.head        second              third
         |                |                  |
         |                |                  |
     +----+------+     +----+------+     +----+------+
     | 10  |  o-------->| 20  | null |     |  30 | null |
     +----+------+     +----+------+     +----+------+ */
		 second.next=third;
		 /*  Now next of the second Node refers to third.  So all three
         nodes are linked.

      llist.head        second              third
         |                |                  |
         |                |                  |
     +----+------+     +----+------+     +----+------+
     | 1  |  o-------->| 2  |  o-------->|  3 | null |
     +----+------+     +----+------+     +----+------+ */
		 printList(head);
	}
	private static void printList(Node head2) {
		// TODO Auto-generated method stub
		Node n=head2;
		while(n!=null)
		{
			System.out.println(n.data+" ");
			n=n.next;
		}
	}

}
