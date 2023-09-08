package Recursion;

public class printNumber_5to1 {

    public static void printNum(int number){
        if(number == 0){
            return;
        }
        System.out.print(number + " ");
        printNum(number - 1);
    }
    public static void main(String[] args) {
        int num = 5;
        printNum(num); 
    }
    
}
