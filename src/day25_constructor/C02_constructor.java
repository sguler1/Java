package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_constructor {
    public static void main(String[] args) {

         C01           obj1               =      new               C01()    ;
        // class adı  // objenin adı             // keyword       // constructor


        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        List<String> list = new ArrayList<>();
        // List<String> list2 = new List<>();

        /*
        Javada bir obje oluşturabilmek için
        mutlaka constructor kullanmalıyız.
         */

        System.out.println(obj1.sayi); // 0
        obj1.deneme(); // C01'den deneme method çalışır
    }
}
