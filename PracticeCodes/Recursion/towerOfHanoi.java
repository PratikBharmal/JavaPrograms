package Recursion;

// Time Complexity = O(2^n-1)~O(2^n)

public class towerOfHanoi {

    public static void tOfHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("Move disk "+n+" from "+src+" to "+dest);
            return;
        }

        tOfHanoi(n-1, src, dest, helper);
        System.out.println("Move disk "+n+" from "+src+" to "+dest);
        tOfHanoi(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        int n = 3;
        tOfHanoi(n,"S","H","D");
    }
}
