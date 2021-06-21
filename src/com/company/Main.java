package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int repeat = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = in.nextLine();
        String[] words = str.split("[^а-яА-Я]");

        Scanner inTwo = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String findWord = inTwo.nextLine();

        Map<String, Integer> check = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (findWord.isEmpty() == false && findWord.equals(words[i]) == true) {
                check.put(findWord, ++repeat);
            }
        }
        System.out.println("Количество повторений слова " + findWord + ": " + check.get(findWord));
    }
}