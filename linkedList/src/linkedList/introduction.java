package linkedList;

import java.util.LinkedList;

public class introduction {

	public static void main(String[] args) {
		 LinkedList<Integer> li= new LinkedList<>(); //Integer LinkedList
		 System.out.println(li);
		 li.add(1);// add method to add element to LinkedList
		 li.add(1,3);
		 System.out.println(li);
		 li.add(40);
		 li.set(0,80);// set command is to replace the existing value to a new value
		 System.out.println(li);
		 li.add(50);
		 li.add(70);
		 li.add(60);
		 li.add(90);
		 System.out.println(li);
		 li.remove(1);
		 System.out.println(li);
		 LinkedList<String> str= new LinkedList<>(); //String Linkedlist
		 str.add("JANMAJAYA");
		 str.add("RAM");
		 System.out.println(str);
		 str.remove("JANMAJAYA");
		 System.out.println(str);
//		 str.removeAll(str);  //removing all the elements form LinkedList
//		 System.out.println(str);
		 
		 LinkedList ll=new LinkedList(); //creating an empty LinkedList 
		  System.out.println(li.getFirst());
		 System.out.println( li.getLast());
		 System.out.println(str.getFirst());
		 System.out.println(  str.getLast() );
		 
		

	}

}
