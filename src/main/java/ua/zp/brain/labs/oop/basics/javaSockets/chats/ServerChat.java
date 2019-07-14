package ua.zp.brain.labs.oop.basics.javaSockets.chats;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class ServerChat {
    public static final int PORT = 4444;
    public static LinkedList<ClientChat> serverList = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(PORT);
             Socket clientSocket = serverSocket.accept();) {

            while (true) {
                serverList.add(new ClientChat(clientSocket));
            }
        } catch (IOException ex) {
            System.out.println("Ошибка сервера");
            System.exit(-1);
        }
    }
}
