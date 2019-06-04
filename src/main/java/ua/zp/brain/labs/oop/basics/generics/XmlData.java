package ua.zp.brain.labs.oop.basics.generics;

/**
 * Created by Brainacad4 on 04.06.2019.
 */
public class XmlData extends AbstractData implements Storable <String> {
    private static final Type type = Type.XML;
    String data;

    public XmlData(long id) {
        super(id);
    }


    @Override
    public String read() {
        return data;
    }

    @Override
    public void write(String data) {

    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "XmlData{" +
                "data='" + data + '\'' +
                '}';
    }
}
