package DSA.HashSet;

import java.util.HashSet;
import java.util.*;
/*
 * ## HashSet Time Complexity ##
 * Insert/Add = O(1)
 * Search/Contains = O(1)
 * Delete/Remove = O(1)
 * 
 * ## Array Time Complexity ##
 * Insert/Add = O(n)
 * Search/Contains = O(log n)
 * Delete/Remove = O(n)
 * 
 * ## Sorted Array Time Complexity ##
 * Insert/Add = O(n)
 * Search/Contains = O(log n)
 * Delete/Remove = O(n)
 * 
 * ## Binary Search Tree Time Complexity ##  in all case avg case TC is O(log n) and in worst case O(n)
 * Insert/Add = O(h) O(n)
 * Search/Contains = O(h) O(log n)
 * Delete/Remove = O(h) O(n)
 */

//  HashSet is Unorder datastructure
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(4);
        set.add(2);
        set.add(5);
        set.add(3);
        set.add(3);
        set.add(3);

        System.out.println(set);

        //search
        if(set.contains(2)){
            System.out.println("2 is present");
        }

        //delete
        set.remove(3);
        System.out.println(set);
 
        // Iterator
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
         System.out.println(it.next());
        }
        
    }
    
}
