package GenralPrograms;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        int LCM = (num1 > num2) ? num1 : num2;
        while (true) {
            if (num1 % LCM == 0 && num2 % LCM == 0) {
                System.out.println("LCM is " + LCM);
                break;
            } else {
                ++LCM;
            }
        }
        sc.close();
    }

}
