package Recursion;

// Time Complexity = O(n)
public class reverseString {
    public static void printRev(String str, int index){
        if(index == 0){
            System.out.print(str.charAt(index)+" "); //it print reverse string last index
            return;
        }

        System.out.print(str.charAt(index)+" ");
        printRev(str, index - 1);

    }
    public static void main(String[] args) {
        String str = "pratik";
        printRev(str, str.length()-1);
    }
    
}
