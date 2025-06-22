import java.util.Scanner;

public class q7 {
     public static void main(String[] args){
                
             System.out.print("Value of n : ");
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             for(int i = 0 ; i < n ; i++ ){
                    
                    for ( int j=0 ; j< n-i-1 ; j++){  // pyramid pattern
                        // no of space = n - i - 1 = 5-0-1=4    
                        System.out.print(" ");
                    }
                    for ( int m = 0; m< i+1; m++){      // no of star = i+1 = 0+1 = 1       
                        // pyramid pattern
                        System.out.print("* ");
                    }
                        System.out.println("");
             }

             sc.close();

            
        }


}

/* 
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        sc.close();
    }
}
*/