import java.util.Scanner;

public class bucket {

	public static void main(String[] args) {
		 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the no of bowels");
 int bowls=sc.nextInt();
 int marbels[]=new int[bowls];
 System.out.println("Enter the value of pebels in each bowel");
 for(int i=0;i<bowls;i++) {
	 marbels[i]=sc.nextInt();
	 }
 int bowelNumber=modifiedBowel(marbels);
 System.out.println(bowelNumber);
 
	}

	private static int modifiedBowel(int[] marbels) {
		 
		int count=0; int index=0;
		for(int i=marbels.length-1; i<0; i++) {
			if(marbels[i]==9) {
				count++;
			}
		}
		if(count==marbels.length) {
			return 0;
		}
		else {
			for(int i=marbels.length-1; i>=0; i--) {
				if(marbels[i]<9) {
					  index=i+1;
					  break;
				}
			}
		}
		return index;
	}

}
