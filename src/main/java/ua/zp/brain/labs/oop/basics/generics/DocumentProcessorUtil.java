package ua.zp.brain.labs.oop.basics.generics;

/**
 * Created by Brainacad4 on 04.06.2019.
 */
public class DocumentProcessorUtil<T extends AbstractData & Storable> {
    static int ID_COUNTER=0;

    private DocumentProcessorUtil() {
    }

    public static <T extends AbstractData & Storable> StringData convert(T data) {
        return new StringData(++ID_COUNTER,data);
    }

    public static <T> void build (Storable storeObj, T data) {
        storeObj.write(data);
    }
}

