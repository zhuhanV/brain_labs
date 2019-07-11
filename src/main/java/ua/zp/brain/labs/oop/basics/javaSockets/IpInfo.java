package ua.zp.brain.labs.oop.basics.javaSockets;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.Date;


public class IpInfo {
    public static void main(String[] args) throws Exception {
        int c;
        URL url = new URL("http://witest.ru/remoting/get_local_ip_address");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        System.out.println("URL: "+urlConnection.getURL());
        System.out.println("Date: " + new Date(urlConnection.getDate()));
        System.out.println("Type: " + urlConnection.getContentType());
        System.out.println("Exp: " + urlConnection.getExpiration());
        System.out.println("Last Modify: " + new Date(urlConnection.getLastModified()));
        System.out.println("Length: " + urlConnection.getContentLength());

        urlConnection.connect();
        if (urlConnection.getContentLength() > 0) {
            System.out.println("=== Content ===");
            try (InputStream input = urlConnection.getInputStream()) {
                int i = urlConnection.getContentLength();
                while (((c = input.read()) != -1) && (--i > 0)) {
                    System.out.print((char) c);
                }
            }
        } else {
            System.out.println("No Content Available");

        }
    }
}

