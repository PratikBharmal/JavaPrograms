package DSA.HashMap;

import java.util.*;

public class UnionOf2Array {
    public static void main(String[] args) {
        int arr1[] = {2, 3 , 5 , 3 , 3 , 5 , 7 , 9 , 1 , 1 , 1 , 2 , 3 , 4};
        int arr2[] = {2, 3 , 5 , 3 , 3 , 5 , 7 , 9 , 1 , 1 , 1 , 2 , 3 , 4};

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i = 0 ; i < arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println(set.size());

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
