package linklist;

import java.util.LinkedList;

public class simpl_experiment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> lnky =new LinkedList<>();
lnky.add(12);
lnky.add(45);
lnky.add(112);
lnky.add(445);
System.out.println(lnky);
lnky.add(3, 56);
System.out.println(lnky);
//lnky.clear();
int p=0;
p=(int)lnky.indexOf(56);
System.out.println(p);
	}

}
