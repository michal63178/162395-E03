package com.company;

import java.time.LocalDate;
import java.util.LinkedList;

public class Z1 {
    public static <T extends Comparable<T>> void redukuj(LinkedList<?> list, int n) {
        for (int i = n - 1; i < list.size(); i += n) {
            list.remove(i);
            i--;

        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list_1 = new LinkedList<>();

        for (int i = 1; i < 11; i++)
            list_1.add(i);

        LinkedList<LocalDate> list_2 = new LinkedList<>();

        list_2.add(LocalDate.of(2022, 1, 1));
        list_2.add(LocalDate.of(2022, 1, 2));
        list_2.add(LocalDate.of(2022, 1, 3));
        list_2.add(LocalDate.of(2022, 1, 4));

        System.out.println("Lista 1. Usuwa co drugi wyraz");
        redukuj(list_1, 2);
        System.out.println(list_1);
        System.out.println("Lista 2. Usuwa co trzeci wyraz");
        redukuj(list_2, 3);
        System.out.println(list_2);

    }
}