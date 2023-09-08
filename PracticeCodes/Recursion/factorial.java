package Recursion;

public class factorial {
    public static int printFact(int number){
        if(number == 1 || number == 0){
            return 1;
        }

        int fact_n = number * printFact(number - 1);
        return fact_n;
    }
    public static void main(String[] args) {
        int number = 5;
        int ans = printFact(number);
        System.out.println("factorial of number is "+ans);
    }
    
}
