package Recursion;


// Time Complexity = O(n)

public class checkSortedArray {
    public static boolean isSorted(int[] arr, int index){
        if(index == arr.length - 1){   //base case
            return true;
        }
        
        if(arr[index] >= arr[index+1]){
            //array is sorted till now
           return false;
        }
            return isSorted(arr, index+1);
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(isSorted(arr,0));
    }
    
}
