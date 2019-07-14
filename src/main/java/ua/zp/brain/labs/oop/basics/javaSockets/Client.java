package ua.zp.brain.labs.oop.basics.javaSockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;

/**
 * Created by Brainacad4 on 09.07.2019.
 */
public class Client {
    public static void main (String[] args) throws IOException {

   System.out.println("Вы что-то хотели сказать? Введите это здесь:");
        try (Socket connectToServerSocket = new Socket("localhost", 4504);
            BufferedReader in = new BufferedReader(
            new InputStreamReader(connectToServerSocket.getInputStream()));
            PrintWriter out = new PrintWriter(connectToServerSocket.getOutputStream(), true);
            BufferedReader inu = new BufferedReader(new InputStreamReader(System.in))) {
        String userInput, serverOutput;
        while ((userInput = inu.readLine()) != null) {
            out.write(userInput);
            out.flush();
            serverOutput = in.readLine();
            System.out.println(serverOutput);
            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }}}}


}
