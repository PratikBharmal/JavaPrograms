package Recursion;

import java.util.HashSet;

//Time Complexity = O(2^n)

public class printSubsequence {

    public static void subsequences(String str, int index, String newString, HashSet<String> set){

        if(index == str.length()){        //base case
           if(set.contains(newString)){
                return;
           }else{
            System.out.println(newString);
            set.add(newString);
            return;
           }
            
        }
        char currChar = str.charAt(index);
        //to be
        subsequences(str, index+1, newString+currChar, set);

        //not to be
        subsequences(str, index+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str,0,"",set);
    }
    
}
