public class dowhile {
    public static void main(String a[]){
        //lets see the how to code with do while loop and nested do while in the same code itself
        int i = 5;
        do {
            System.out.println("Hello " + i ); 
            i++;            //nested do while loop 
            int j = 3 ;
            do {
                System.out.println("Hello" + j);
                j++;
            } while (j < 3);
        } while (i < 5);
        System.out.println("End " + i);
    }
}