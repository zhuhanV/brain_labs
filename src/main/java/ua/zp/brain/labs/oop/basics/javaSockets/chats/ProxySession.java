package ua.zp.brain.labs.oop.basics.javaSockets.chats;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ProxySession {

    public static void main(String[] args) {
        try {
            Socket socket1 = new Socket("localhost", 4444);
            ClientChat clientChat = new ClientChat(socket1);
            broker(clientChat);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void broker (ClientChat clientChat) {
        if (clientChat != null) {
            clientChat.run();
            }
        }
    }

