package skill;

public class minimum_maximum_sum {
public static void main(String[]args) {
	int [] n= {5,85,7,6,8}; int s=0; int su=0;
	int max= Math.max(n[4], Math.max(n[3], Math.max(n[2], Math.max(n[1], n[0]))));
	int min= Math.min(n[4], Math.min(n[3], Math.min(n[2], Math.min(n[1], n[0]))));
	System.out.println(max);
	System.out.println(min);
	for (int i=0;i<5;i++) {
		if(n[i]!=max) {
			s=s+n[i];
		}
	}
	for (int i=0;i<5;i++) {
		if(n[i]!=min) {
			su=su+n[i];
		}
	}
	System.out.println(s+" "+su);
}
}
