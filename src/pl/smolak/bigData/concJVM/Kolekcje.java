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
                mapa.put(i, mapa.get(i) + 1);
            } else {
                mapa.put(i, 1);
            }
        }

        for (Entry<String, Integer> i : mapa.entrySet()) {
            if (i.getValue() == 1) {
                wynik.add(i.getKey());
            }
        }
        System.out.println(wynik.toString());
    }

    public static void main(String[] args) {
        System.out.println("Pierwsza wersja");
        test1();
    }
}
