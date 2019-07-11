package ua.zp.brain.labs.oop.basics.javaSockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Brainacad4 on 09.07.2019.
 */
public class Client2 {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter to send message to server. Write ‘exit’ to close");
        try (Socket connectToServerSocket = new Socket("localhost", 8888);
             BufferedReader in = new BufferedReader(
                     new InputStreamReader(connectToServerSocket.getInputStream())
             );
             PrintWriter out = new PrintWriter(connectToServerSocket.getOutputStream(), true);
             BufferedReader inu = new BufferedReader(new InputStreamReader(System.in));) {
            String userInput, serverOutput;
            while ((userInput = inu.readLine()) != null) {
                out.println(userInput);
                serverOutput = in.readLine();
                System.out.println(serverOutput);
                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }
            }
        }
    }
}

