package day16_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // Verilen bir pozitif tam sayının pozitif tam bölenlerini yazdıralım

        int input = 120;

        for (int i = 1; i <= input; i++) {

            if (input % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
