package Recursion;

public class printNumber_1to5 {

    public static void printNum(int number){
        if(number > 5){
            return;
        }

        System.out.print(number+" ");
        printNum(number + 1);
    }
    public static void main(String[] args) {
        int num = 1;
        printNum(num);
    }
    
}
