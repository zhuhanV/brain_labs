package ua.zp.brain.labs.oop.basics.javaIOStreams;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DirectoryFilesPrinter {
    public static void main(String[] args) {
        File file = new File("D:\\работы студентов");
        printNames(file.listFiles());
    }

    public static void printNames(File... files) {
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
                if (file.isDirectory()) {
                    printNames(file.listFiles());
                }
            }
        } else
            System.out.println("Каталог не существует или пуст");
    }
}


