package Recursion;
// Time Complexity = O(n)
class print_XpowN{

    public static int printPow(int x, int n){
        if(n == 0){
            return 1;
        }

        if(x == 0){
            return 0;
        }

        int pow = x * printPow(x ,  n - 1);
        return pow;
    }
    public static void main(String[] args) {
        int x = 2 ,n = 2;
        int ans = printPow(x, n);
        System.out.println(ans);
    }
}