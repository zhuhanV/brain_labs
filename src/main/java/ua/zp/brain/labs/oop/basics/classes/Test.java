package main.java.ua.zp.brain.labs.oop.basics.classes;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("___________________________________________________________________________________");
        Book book = new Book();
        book.setName("\"Сліди на дорозі\"");
        book.setAuthor("Валерій Ананьєв");
        book.setId(10101);
        System.out.println("ім'я класу: " + book.getClass().getName() + "\n" +
                "найменування книги: " + book.getName() + "\n" +
                "автор: " + book.getAuthor() + "\n" +
                "артикул: " + book.getId() + "\n" +
                "магазин, де продається: " + Book.getShop() + "\n" +
                "кількість сторінок: " + book.getPage() + "\n" +
                "кількість розділів: " + book.getChapter() + "\n" +
                "вартість: " + book.getPrice() + " грн.");

        System.out.println("Введіть поточну сторинку");
        Scanner scanPage = new Scanner(System.in);
        System.out.println("наступна сторінка: " + book.goPage(scanPage.nextInt()));

        System.out.println("Введіть поточний розділ");
        Scanner scanChapters = new Scanner(System.in);
        System.out.println("наступний розділ: " + book.goPage(scanChapters.nextInt()));

        System.out.println("___________________________________________________________________________________");
        Client client = new Client();
        client.setId(5);
        System.out.println("ім'я класу: " + client + "\n" +
                "id клєнта: " + client.getId() + "\n" +
                "ПІБ: " + client.getName() + "\n" +
                "адреса клієнта: " + client.getAddress() + "\n" +
                "телефон клієнта: " + client.getNumberTel());

        System.out.println("___________________________________________________________________________________");
        PostOffice postOffice = new PostOffice();
        System.out.println("ім'я класу: " + postOffice + "\n" +
                "id відділення: " + postOffice.getId() + "\n" +
                "Найменування відділення: " + postOffice.getName() + "\n" +
                "адреса відділення: " + postOffice.getAddress() + "\n" +
                "телефон відділення: " + postOffice.getNumberTel());
        System.out.println("вага посилки " + postOffice.calculateWeight(100, 120.0, 135.85));
    }
}

