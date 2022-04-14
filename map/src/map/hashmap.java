package map;
import java.util.*;
import java.util.Map.Entry;
public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String, Integer> map =new HashMap<>();
		map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        map.put("Janmajaya", 69);
        System.out.println("HashMap");
        System.out.println(map);
        System.out.println(map.containsValue(10));
        System.out.println(map.containsKey("Janmajaya"));
        Set<Entry<String, Integer>> key = map.entrySet();
        System.out.println("key"+key);
        
        
        
        LinkedHashMap <String, Integer> map_ =new LinkedHashMap<>();
        map_.put("vishal", 10);
        map_.put("sachin", 30);
        map_.put("vaibhav", 20);
        map_.put("Janmajaya", 69);
        System.out.println("LinkedHashMap");
        System.out.println(map_);
        
        /* map iteration using for each Loop */
       for(Map.Entry mentry : map_.entrySet()) {
    	   String key_ = (String)mentry.getKey();
    	    int val =(int)mentry.getValue();
    	    System.out.println(key_ +" : "+ val);
       }
         
        
	}

}
