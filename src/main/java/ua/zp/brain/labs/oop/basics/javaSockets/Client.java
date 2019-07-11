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
public class Client implements Runnable {

    private String host;
      public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public Client() {
    }
    public Client(String host) {
        this.host = host;
            }



    public Socket clientConnect(String host) throws IOException {
       Socket connectToServerSocket = new Socket(host, 8888);
       return connectToServerSocket;
    }

    public  void sendMsg() throws IOException {
        System.out.println("Enter to send message to other. Write ‘exit’ to close");
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientConnect(host).getInputStream()));
             PrintWriter out = new PrintWriter(new Client().clientConnect(host).getOutputStream(), true);
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
    public static void receiveMsg () throws IOException{
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


    @Override
    public void run() {
        try {
            clientConnect(this.host);
            sendMsg();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


