package ____infosys____;

import java.util.*;
public class Infosys_RPG {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nom=sc.nextInt();
		int inixp=sc.nextInt();
//		int[] pom=new int[nom];
//		int[] bom=new int[nom];
		ArrayList<Integer> power=new ArrayList<>();
		ArrayList<Integer> bonus=new ArrayList<>();
		int dm=0;
		for(int i=0;i<nom;i++)
		{
			power.add(sc.nextInt());
		}
		for(int i=0;i<nom;i++)
		{
			bonus.add(sc.nextInt());
		}
		int i=0;
		while(i<nom)
		{
			if(inixp>=power.get(i))
			{
				dm++;
				inixp+=bonus.get(i);
				power.remove(i);
				bonus.remove(i);
				i=0;
				nom--;
			}
			else {
				i++;
			}
		}
		System.out.println(dm);

	}

}