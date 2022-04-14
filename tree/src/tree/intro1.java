package tree;
class node{
	int key;
	node left, right;
	node(int k){
		this.key=k;
	}
}
public class intro1 {
	public static void main(String[] args) {
		 
node root=new node(10);
root.left=new node(20);
root.right=new node(30);
root.left.left=new node(40);
root.left.right=new node(50);
root.right.left=new node(60);
root.right.right=new node(70);
root.right.right.right=new node(80);
	}

}
