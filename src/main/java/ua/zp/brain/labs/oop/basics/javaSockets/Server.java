package ua.zp.brain.labs.oop.basics.javaSockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException{
        try (ServerSocket serveSocket = new ServerSocket(8888);
             Socket clientSocket = serveSocket.accept();
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);) {
            String input;
            String output;
            System.out.println("Wait for message");
            while ((input = in.readLine()) != null) {
                if (input.equalsIgnoreCase("exit")) break;
                out.println("Response ::: " + "echo ->" + input);
                System.out.println(input);
            }
        } catch (IOException ex) {
            System.out.println("Error on server");
            System.exit(-1);
        }
    }
}

