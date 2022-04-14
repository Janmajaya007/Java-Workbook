
import java.io.*;
import java.util.*;

public class solution_ {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Sports s= new Sports();
        System.out.println(s.getName());
        s.getNumberOfTeamMembers();
        Soccer so= new Soccer();
        System.out.println(so.getName());
        so.getNumberOfTeamMembers();
        List<Integer> ne= new ArrayList<>();
        find(ne);
    }

	private static void find(List<Integer> ne) {
		// TODO Auto-generated method stub
		
	}
}
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}