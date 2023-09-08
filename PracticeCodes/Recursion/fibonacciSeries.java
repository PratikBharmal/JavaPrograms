package Recursion;
// Using Recursion

// Time Complexity = O(2^n)
// Space Complexity = O(n)
// public class fibonacciSeries {

//     public static int fiboRecursion(int numLength){
//         if(numLength == 0){
//             return 0;
//         }
        
//         if(numLength == 1){
//             return 1;
//         }
//             return fiboRecursion(numLength - 1) + fiboRecursion(numLength - 2);
//         }
//     public static void main(String[] args) {
       
//         int numLength = 10;
//         for(int i = 0; i < numLength; i++){
//            System.out.print(fiboRecursion(i)+" ");
//         }
        
//     }
    
// }

// This is General Method Using Swapping 
/* 

Time Complexity: O(n)
Space Complexity: O(1)

import java.util.*;


public class fibonacciSeries {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      
       int a = 0, b = 1;
          
       System.out.print(a+" ");
      
       if(n > 1) {
           //find nth term
           for(int i=2; i<=n; i++) {
               System.out.print(b+" ");
               //the concept below is called swapping
               int temp = b;
               b = a + b;
               a = temp;
           }


           System.out.println();
       }
   }   
}

*/


class fibonacciSeries {
    public static void printFibonacci(int a, int b, int num){
        //Base Case
        if(num == 0)
            return;

        //Printing the next Fibonacci number    
        int c = a + b;
        System.out.print(c + " ");

        //Recursively calling for printing Fibonacci for remaining length
        printFibonacci(b, c, num - 1);
    }
    public static void main(String args[]) {
        System.out.println(" *** Fibonacci Series *** ");

            int a = 0 , b = 1;
            int num = 10;
        //Printing the first two values
        System.out.print(a+ " ");
        System.out.print(b+ " ");

        //Calling Method to print the fibonacci for length 10
        printFibonacci(a, b, num-2);
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)