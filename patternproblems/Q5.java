import java.util.Scanner;

public class Q5 {
     public static void main(String[] args){
                
             System.out.print("Value of n : ");
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             for(int i = 0 ; i < n ; i++ ){
                    
                    for ( int j=0 ; j< n-i ; j++){
                        System.out.print("*");
                    }
                        System.out.println(" ");
             }

            //  sc.close();

            
        }


}
