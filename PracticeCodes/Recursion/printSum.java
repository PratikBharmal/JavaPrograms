package Recursion;

public class printSum {

    public static void pSum(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.print(sum+" ");
            return;
        }
        
        sum += i;
        pSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        
        pSum(1,5,0);
    }
    
}
