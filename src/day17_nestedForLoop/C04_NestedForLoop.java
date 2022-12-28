package day17_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        Verilen inputa'a göre *'lardan oluşan bir üçgen oluşturun

        Örnek ----->> input = 4

             *
             * *
             * * *
             * * * *
         */

        int input = 5;
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
