package pl.smolak.bigData.concJVM;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by xwsmolak on 10/30/16.
 */
public class Kolekcje2 {
    public static void main(String[] args) {
        String[] l = new String[4];
        int[] p = new int[20];

        String[] list = {"ala","ma","kota","i","kota"};

        Set<String> unikalny = new HashSet<>();
        Set<String> duplikaty = new HashSet<>();
        for (String s : list){
            if(!unikalny.add(s)){
                duplikaty.add(s);
            }
        }
        System.out.println(unikalny);
        System.out.println(duplikaty);
        unikalny.removeAll(duplikaty);
        System.out.println(unikalny);
    }
}
