package DSA.HashMap;

import java.util.HashMap;

public class MajorityElement {
    public static void majorityElements(int[] arr1){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr1.length;

        for(int i = 0; i < n; i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i], map.get(arr1[i]) + 1);
            }else
            {
                map.put(arr1[i], 1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int arr1 [] = {2, 3 , 5 , 3 , 3 , 5 , 7 , 9 , 1 , 1 , 1 , 2 , 3 , 4};

        majorityElements(arr1);
        
    }
}
