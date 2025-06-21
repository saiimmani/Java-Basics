import java.util.Scanner;

public class Q6 {
     public static void main(String[] args){
                
             System.out.print("Value of n : ");
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             for(int i = 0 ; i < n ; i++ ){
                    
                    for ( int j=0 ; j< n-i-1 ; j++){  // no of space = n - i - 1 = 5-0-1=4
                        System.out.print(" ");
                    }
                    for ( int m = 0; m< i+1; m++){   // no of star = i+1 = 0+1 = 1
                        System.out.print("*");
                    }
                        System.out.println(" ");
             }

            //  sc.close();

            
        }


}
