package ua.zp.brain.labs.oop.basics.generics;

import java.util.Arrays;

/**
 * Created by Brainacad4 on 04.06.2019.
 */
public class BinaryData extends AbstractData implements Storable <byte []>{

    private static final Type type = Type.BIN;
    byte [] data;

    public BinaryData(long id) {
        super(id);
    }


    @Override
    public byte[] read() {
        return data;
    }

    @Override
    public void write(byte[] data) {

    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "BinaryData{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
