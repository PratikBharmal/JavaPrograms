package Recursion;
//Time Complexity = O(n)

public class removeDuplicates {
    public static boolean[] map = new boolean[26];

    public static void remDuplicate(String str, int index, String newString){
        
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        
        char currChar = str.charAt(index);

        if(map[currChar - 'a']){
            remDuplicate(str, index + 1, newString);
        }else{
            newString += currChar;
            map[currChar - 'a'] = true;
            remDuplicate(str, index + 1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        remDuplicate(str, 0, "");
    }
}
