package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        // Verilen bir arraydeki tekrar eden elementleri silip
        // tekrarsız halini arraye atayan bir kod yazınız.

        int[] arr = {4, 5, 3, 6, 8, 5, 1, 9, 0, 4, 2, 5, 7, 9, 1, 2, 5, 7, 6};
        Set<Integer> tekrarsizSet = new HashSet<>();

        for (int each : arr) {
            tekrarsizSet.add(each);
        }
        System.out.println("Set : " + tekrarsizSet);

        int[] tekrarsizArr = new int[tekrarsizSet.size()];

        int i = 0;
        for (int each : tekrarsizSet) {
            tekrarsizArr[i] = each;
            i++;
        }
        arr = tekrarsizArr;
        System.out.println("Bizim arrayin son hali : " + Arrays.toString(tekrarsizArr));

    }
}