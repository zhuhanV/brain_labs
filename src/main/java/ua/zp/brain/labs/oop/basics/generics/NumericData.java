package ua.zp.brain.labs.oop.basics.generics;

/**
 * Created by Brainacad4 on 04.06.2019.
 */
public class NumericData extends AbstractData implements Storable <Number>{

    private static final Type type = Type.NUM;
    private Number data;
    public NumericData(long id) {
        super(id);
    }

    public Number getData() {
        return data;
    }

    public void setData(Number data) {
        this.data = data;
    }

    @Override
    public String convertToString() {
        return String.valueOf(data);
    }

    @Override
    public Number read() {
        return data;
    }

    @Override
    public void write(Number data) {
        this.data = data;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "NumericData{" +
                "data=" + data +
                "} ";
    }
}
