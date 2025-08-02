package Recursion;
// This program calculates the nth Fibonacci number using recursion.
// It reads an integer n from the input and prints the nth Fibonacci number.    
import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        // print the fibonacci series up to n
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println( fibonacci(n));
    }
}
