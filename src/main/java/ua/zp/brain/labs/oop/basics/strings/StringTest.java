package ua.zp.brain.labs.oop.basics.strings;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        //2
        String s = "String литерал";
        String s1 = new String("String new");
        String[] s2 = {"String ", "массив"};
        String s3 = "String из байтов";
        String s4 = new String(s3.getBytes());
        StringBuilder s5 = new StringBuilder("String из StringBuilder");
        String s6 = new String(s5);

        //3-1,2
        String s7 = "Апельсин,Яблоко,Гранат,Груша";
        String[] s8 = s7.split(",");
        for (int i = 0; i < s8.length; i++) {
            System.out.println(s8[i]);
        }
        //3-3

        int maxIndex = 0;
        String maxString = null;
        for (int i = 0; i < s8.length; i++) {
            if (s8[i].length() > maxIndex) {
                maxIndex = s8[i].length();
                maxString = s8[i];
            }
        }
        System.out.println(maxString.toLowerCase());


        //3-4
        String[] s9 = new String[s8.length];
        for (int i = 0; i < s8.length; i++) {
            s9[i] = s8[i].substring(0, 3);
            System.out.println(s9[i]);
        }

        //3-5.6
        String s10 = " Я_новая_строка ";
        System.out.println(s10);
        String s11 = s10.trim();
        System.out.println(s11);

        //3-7,8
        System.out.println(s11.replace("_", " "));

        //3-9
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String s12 = scanner.nextLine().toLowerCase();
        System.out.println("Вы ввели: " + s12);

        //3-10, 11,12,
        String s13 = "Запуск";
        String s14 = "завершен";
        String s15 = "ошибка";
        if (s12.equalsIgnoreCase(s13)) {
            System.out.println("Запускаем процесс");
        } else if (s12.equalsIgnoreCase(s14)) {
            System.out.println("Процесс завершен");
        } else if (s12.equalsIgnoreCase(s15)) {
            System.out.println("Произошла ошибка");
        }

        switch (s12) {
            case "запуск":
                System.out.println("Запускаем процесс");
                break;
            case "завершен":
                System.out.println("Процесс завершен");
                break;
            case "ошибка":
                System.out.println("Произошла ошибка");
                break;
            default:
                System.out.println("ВВедите правильное слово");
        }


        //4-1,2

        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append(s)
                .append(s1)
                .append(s3)
                .append(s4)
                .append("\n")
                .append(s5)
                .append(s6)
                .append(s7)
                .append("\n")
                .append(s10)
                .append(s11)
                .append("\n")
        ;
        System.out.println(stringBuilder);


        //4-3
        System.out.println(stringBuilder.reverse());


    }
}
