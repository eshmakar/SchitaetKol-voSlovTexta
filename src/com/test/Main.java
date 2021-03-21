package com.test;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String s = scanner.nextLine();
        String[] mas = s.replace("!", "").replace("?", "").replace("»", "").replace("«", "").replace("—", "").replace(",", "").replace("(", "").replace(")", "").replace(".", "").replace("  ", " ").split(" ");
        int count = 0;
        int count2 = 0;
        int max = 0;
        String dlinnoeSlovo = "";

        for (String x : mas) {
            count++;
        }

        Set<String> temp = new HashSet<>(Arrays.asList(mas));
        for (String xx : temp) {
            max = Math.max(max, xx.length());
            if (max == xx.length()) dlinnoeSlovo = xx;
            System.out.println(++count2 + ". " + xx);
        }


        System.out.println();
        System.out.printf("Текст содержит: %d слов. Кол-во не повторяющихся слов: %d. Самое длинное слово: '%s', оно содержит %d символов\n", count, count2, dlinnoeSlovo, max);
        scanner.close();
    }
}
