package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int repeat = 0;
        int i = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = in.nextLine();
        String[] words = str.split("[^а-яА-ЯA-Za-z0-9]+");

        Map<String, Integer> check = new LinkedHashMap<>();
        for (String num : words) {
            Integer counter = check.get(num);
            if (counter == null) {
                counter = 0;
            }
            check.put(num, counter + 1);
        }
        System.out.println(check);
    }
}