package ua.zp.brain.labs.oop.basics.javaIOStreams;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("D:\\работы студентов\\pop.txt");
             FileOutputStream fos = new FileOutputStream("D:\\работы студентов\\popNew.txt")) {
            byte[] buffer = new byte[fis.available()];

            fis.read(buffer, 0, buffer.length);
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
