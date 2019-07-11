package ua.zp.brain.labs.oop.basics.javaSockets;


import java.io.IOException;

public class ProxySession {
    public static void main(String[] args) throws IOException {

        Client client1 = new Client("localhost");
        client1.run();
     }
}
