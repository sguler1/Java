package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
        /*
        Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin
         */

        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        // Sondan başa gelebilmek için önce sona gitmek lazım

        ListIterator li1 = liste.listIterator();
        System.out.println(liste);
        while (li1.hasNext()) {
            li1.next();
        }
        // Bu loop bizi sona götürür

        while (li1.hasPrevious()) {
            System.out.print(li1.previous() + " ");
        }
    }
}