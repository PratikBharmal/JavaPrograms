package GenralPrograms;

// Two Pointer Method
public class stringReverse {

    public static String rev(String str) {
        int start = 0;
        int end = str.length() - 1;  //5

        char[] charArray = str.toCharArray();

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "pratik";

        System.out.println(" " + rev(str));

    }
}
