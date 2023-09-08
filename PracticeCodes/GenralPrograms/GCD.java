package GenralPrograms;
import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 :");
        int num2 = sc.nextInt();

        int GCD = (num1 < num2) ? num1 : num2;

        while(true){
            if(num1 % GCD == 0 && num2 % GCD == 0){
                System.out.println("Greatest Common Divisor "+GCD);
                break;
            }else{
                --GCD;
            }
        }

        sc.close();
    }
    
}
