package Recursion;
// find 1st and last Occurance of element in String
// Time Complexity = O(n)
public class stringOccurance {
    public static int first = -1;
    public static int last = -1;
    public static void findOccuranceElement(String str, int index, char element){
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        
        char currChar = str.charAt(index);
        if(currChar == element){
            if(first == -1){
                first = index;
            }else{
                last = index;
            }
        }

        findOccuranceElement(str, index+1, element);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        
         findOccuranceElement(str,0, 'a');
    }
    
}
