package GenralPrograms;

public class reverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("pratik");

        // Time complexity of this code is O(n)
        
        for(int i = 0; i < sb.length()/2; i++){
            int start = i;
            int end = sb.length() - 1 - i;

            char startChar = sb.charAt(start);
            char endChar = sb.charAt(end);

            sb.setCharAt(startChar, endChar);
            sb.setCharAt(endChar,startChar);
        }

        System.out.print(sb);
    }
    
}
