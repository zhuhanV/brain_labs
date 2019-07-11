package ua.zp.brain.labs.oop.basics.serialization;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeTest {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\работы студентов\\card.txt")))
        {
            CreditCard card = null;
            try {
                card = (CreditCard) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.printf("bankName: %s \t cardType: %s \t CardNumber: %s \n exp: %s \t cvv: %d", card.getBankName(), card.getCardType(), card.getCardNumber(), card.getExp(), card.getCvv());
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
