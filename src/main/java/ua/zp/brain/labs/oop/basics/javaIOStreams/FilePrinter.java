package ua.zp.brain.labs.oop.basics.javaIOStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FilePrinter {
    public static void main(String[] args) {

        File file = new File("https://github.com/zhuhanV/brain_labs/tree/master/src/main/java/ua/zp/brain/" +
                "labs/oop/basics/nestedclasses");
        try (FileInputStream fin = new FileInputStream(file)) {


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}

