package ua.zp.brain.labs.oop.basics.javaSockets.chats;

import java.io.*;
import java.net.Socket;

public class ClientChat implements Runnable {
    private Socket socket;
    BufferedReader in;
    PrintWriter out;


    public ClientChat(Socket socket) throws IOException {
        this.socket = socket;
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.out = new PrintWriter(socket.getOutputStream(), true);
        run();
    }

    private void send(String msg) {
        try (BufferedReader inu = new BufferedReader(new InputStreamReader(System.in))) {
            while ((msg = inu.readLine()) != null) {
                out.write("Сообщение " + msg + "\n");
                out.flush();
            }
        } catch (IOException ignored) {
        }
    }
    private void receiving() {
        try {
            in.read();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        String word;
        try {
            while (true) {
                word = in.readLine();
                if (word.equalsIgnoreCase("exit")) {
                    break;
                }
                for (ClientChat chat : ServerChat.serverList) {
                    chat.send(word);
                }
            }
        } catch (IOException ex) {
        }
        receiving();
    }
}
