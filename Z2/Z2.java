package com.company;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Z2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 1; i < 11; i++)
            set.add(i);

        Iterator<Integer> iterator = set.iterator();
        int sl1 = 22;

        while (iterator.hasNext()) {
            int temp = iterator.next();

            if (sl1 == temp)
                iterator.remove();

        }

        System.out.print(set);

        LinkedHashSet<Character> set_2 = new LinkedHashSet<>();

        set_2.add('o');
        set_2.add('m');
        set_2.add('g');

        Iterator<Character> iterator_2 = set_2.iterator();
        char sl2 = 'm';

        while (iterator_2.hasNext()) {
            char temp_2 = iterator_2.next();

            if (sl1 == temp_2)
                iterator_2.remove();

        }

        System.out.print(set_2);

    }
}
