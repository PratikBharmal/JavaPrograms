package DSA.ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//remove duplicate from Arraylist with same order
//time complexity = O(n)
//space complexity = O(n)

public class removeDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(4);
		list.add(7);
		list.add(9);
		
		System.out.print("Original : "+list);
		
		Set<Integer> set = new LinkedHashSet<>(list);
		set.addAll(list);
		System.out.println();
		System.out.print("after remove duplicates : "+set);
    }
}
