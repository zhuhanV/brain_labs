package ua.zp.brain.labs.oop.basics.serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTest {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\работы студентов\\card.txt"))) {
            CreditCard creditCard = new CreditCard(CardType.MASTER_CARD,"Privat","1254 2562 2525 5454", "21/09", 258);
            oos.writeObject(creditCard);



        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
