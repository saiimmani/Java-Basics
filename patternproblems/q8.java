import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 0 ; i < n; i++) {
            // Print spaces
            for (int j = 0 ; j < n - i-1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0 ; k < (2 * i + 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        } 
             for (int i = 0 ; i < n -1 ; i++) {
            // Print spaces
            for (int j = 0 ; j < i+1 ; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0 ; k < 2  * (n - 1 - i )-1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        } 

        sc.close();
    }
}

/*
 * import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Top half of diamond
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }

        // Bottom half of diamond
        for (int i = n - 2; i >= 0; i--) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}

 */