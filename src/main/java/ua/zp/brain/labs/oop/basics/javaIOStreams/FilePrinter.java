package ua.zp.brain.labs.oop.basics.javaIOStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FilePrinter {
    public static void main(String[] args) {

        File file = new File("D:\\работы студентов\\zhuhan\\brain_labs\\src\\main\\java" +
                "\\ua\\zp\\brain\\labs\\oop\\basics\\abstracts\\devices\\AbstractDevice.java");
        try (FileInputStream fin = new FileInputStream(file)) {
            int i = -1;
            while((i=fin.read())!=-1){
            System.out.print((char)i);}
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}

