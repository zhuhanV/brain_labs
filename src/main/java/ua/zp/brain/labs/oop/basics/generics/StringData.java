package ua.zp.brain.labs.oop.basics.generics;

/**
 * Created by Brainacad4 on 04.06.2019.
 */
public class StringData extends AbstractData {
    Type type;
    String data;

    public <T extends  AbstractData & Storable> StringData(long id, T data) {
        super(id);
        this.type = data.getType();
        this.data = data.convertToString();
        }


    @Override
    String convertToString() {
        return data;
    }

    @Override
    public String toString() {
        return "StringData{" +
                "type=" + type +
                ", data='" + data + '\'' +
                "} ";
    }
}
