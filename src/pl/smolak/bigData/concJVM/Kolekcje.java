package pl.smolak.bigData.concJVM;

import java.util.*;
import java.util.Map.Entry;
/**
 * Created by xwsmolak on 10/30/16.
 */
public class Kolekcje {
    private static void test1() {
        String[] list = "Wojtek Wojtek siedzi siedzi na na zajeciach zajeciach na na polibudzie polibudzie".split("\\s");
        System.out.println(Arrays.toString(list));

        Set<String> zbior = new HashSet<>();
        for (String i : list) {
            zbior.add(i);
        }
        // zbior pojedynczych wartosci
        System.out.println(Arrays.toString(zbior.toArray(new String[0])));

        List<String> wynik = new ArrayList();
        Map<String, Integer> mapa = new HashMap<>();
        for (String i : list) {
            if (mapa.containsKey(i)) {
                mapa.put(i, mapa.get(i) + 1); //jezeli mapa zawiera juz klucz "i" zwiekszamy licznik
            } else {
                mapa.put(i, 1);
            }
        }

        for (Entry<String, Integer> i : mapa.entrySet()) {
            if (i.getValue() == 1) {
                wynik.add(i.getKey()); //dodajemy do wyniku tylko klucze z wartoscia 1
            }
        }
        System.out.println(wynik.toString());
    }

    private static void test2() {
        String[] list = "Wojtek Wojtek siedzi siedzi na na zajeciach zajeciach na na polibudzie polibudzie".split("\\s");
        System.out.println(Arrays.toString(list));

        Set<String> zbior = new HashSet<>();
        List<String> duplikaty = new ArrayList<>();
        for (String i : list) {
            if (!zbior.add(i)) {
                duplikaty.add(i);
            }
        }
        zbior.removeAll(duplikaty);
        System.out.println(duplikaty.toString());
        System.out.println(zbior.toString());
    }

    public static void main(String[] args) {
        System.out.println("Pierwsza wersja");
        test1();
        System.out.println("Druga wersja");
        test2();
    }
}
