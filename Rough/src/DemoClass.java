import java.util.*;
public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<String,String> map = new TreeMap<String,String>();
map.put("a", "aligator");
map.put("e", "exit");
map.put("g", "goal");
SortedMap<String, String> smap=map.subMap("a","e");
smap.put("b","bash");
smap.put("f","flat");
map.put("c", "calci");
map.remove("a");
System.out.println(smap);
System.out.print(map);
	}

}
