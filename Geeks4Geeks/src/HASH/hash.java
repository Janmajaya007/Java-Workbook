package HASH;
import java.util.*;
public class hash {
int bucket;
ArrayList<LinkedList<Integer>> table;
public hash(int key) {
	this.bucket=key;
	table=new ArrayList<LinkedList<Integer>>();
	for(int i=0;i<key;i++)
		table.add(new LinkedList<Integer>());
}

public void insert(int key) {
	int i=key%bucket;
	table.get(i).add(i);
}
public boolean search(int key) {
	int i=key%bucket;
	return table.get(i).contains(i);
}
public void delete(int key) {
	int i=key%bucket;
	table.get(i).remove((Integer)i);
}
	public static void main(String[] args) {
		 hash h=new hash(10);
		 h.insert(10);
		 h.insert(20);
		 h.insert(30);
		 h.insert(40);
		 h.insert(50);
		 h.insert(60);
		 System.out.println(h+" ");

	}

}
