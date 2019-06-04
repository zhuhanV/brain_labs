package ua.zp.brain.labs.oop.basics.generics;

/**
 * Created by Brainacad4 on 04.06.2019.
 */
public class NumericData extends AbstractData implements Storable <Number>{

    private static final Type type = Type.NUM;
    Number data;
    public NumericData(long id) {
        super(id);
    }

    @Override
    public Number read() {
        return data;
    }

    @Override
    public void write(Number data) {

    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public String toString() {
        return "NumericData{" +
                "data=" + data +
                '}';
    }
}
