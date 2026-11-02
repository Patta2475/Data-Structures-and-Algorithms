import java.util.Scanner;
public class Fibonacci {
    static long[] F;

    private static long fib(int n){
        if (n <= 1){
            return n;
        } 
        if (F[n] == 0){
                F[n] = fib(n-1) + fib(n-2);
        }
        return F[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        F = new long[n+1];

        System.out.println("fib" + "(" + n + ") is " + fib(n) );
        sc.close();
    }
}