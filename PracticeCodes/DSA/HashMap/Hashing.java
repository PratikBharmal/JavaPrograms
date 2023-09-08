package DSA.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//HashMap is Unorderd
// Time Complexity O(1)
// HashMap internally implimente with the help of Array of LinkedList

public class Hashing {
    public static void main(String[] args) {
        //country(key), population(value)

        HashMap<String, Integer> map = new HashMap<>();
        
        //Insertion

        map.put("India", 120);
        map.put("US", 40);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);  //key is already exist so here value is updated to china 150 to 180

        System.out.println(map);

        // search

        if(map.containsKey("China")){
            System.out.println("china is present");
        }else{
            System.out.println("china is not present");
        }

        System.out.println(map.get("China")); //key exist
        System.out.println(map.get("Indonesia")); //key is not exist

        // delete
        map.remove("China");
        System.out.println(map);


        // Iteration in HashMap

        System.out.println("Using Map iteration");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        System.out.println("using set iteration");

        Set<String> k = map.keySet();
        for(String key : k){
            System.out.println(k + " "+map.get(key));
        }

        // System.out.println(k.hashCode());  
    }
}
