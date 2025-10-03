import java.util.Scanner;

public class Factorial {

      public static int FactorialFunction (int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return n * FactorialFunction(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of "+ n +" = " + FactorialFunction(n));
       
    }
}
