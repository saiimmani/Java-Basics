
import java.util.Scanner;

public class Lps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // for input
         int n = sc.nextInt();  // for input
         for (int i = 1 ; i <= n ; i++) {
             System.out.println("*" +" " + "Inner");
             for(int j = 1 ; j <= n; j++){
                 System.out.println("*" + " " + "Outer");
             }
            
         }

    }
}
