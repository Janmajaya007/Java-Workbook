package sorting;

import java.util.*;
class point implements Comparable<point>
{  int x,y;
	point(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public int compareTo(point p)
	{
		return this.x-p.x;
	}
}
  class implement_comparable_interface_for_sorting_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 List<Integer> arr = new ArrayList<Integer>();
		 arr.add(new point(12,89));
		 arr.add(new point(2,9));
		 arr.add(new point(1,8));
		Collections.sort(arr);
//		for(int a:arr)
//		{
//			System.out.println(a);
//		}
//		sc.close();

	}

}
