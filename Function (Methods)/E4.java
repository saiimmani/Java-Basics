public class E4 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Int sum: " + add(2, 3));
        System.out.println("Double sum: " + add(2.5, 3.7));
    }
}
