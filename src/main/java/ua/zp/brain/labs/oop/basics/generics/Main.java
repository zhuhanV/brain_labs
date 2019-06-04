package ua.zp.brain.labs.oop.basics.generics;

import java.util.Arrays;

/**
 * Created by Brainacad4 on 04.06.2019.
 */
public class Main {

    public static void main(String[] args) {
        XmlData xmlData = new XmlData(DocumentProcessorUtil.ID_COUNTER++);
        BinaryData binaryData = new BinaryData(DocumentProcessorUtil.ID_COUNTER++);
        NumericData numericData = new NumericData(DocumentProcessorUtil.ID_COUNTER++);

        String xml = "<?xml version= \"1.0 \"?><Tests>qwerty</Tests>";
        DocumentProcessorUtil.build(xmlData,xml);
        String s = "Данные в байтах";
        byte [] bytes = s.getBytes();
        DocumentProcessorUtil.build(binaryData, bytes);
        Double d = 123.456789;
        DocumentProcessorUtil.build(numericData, d);

        DocumentProcessorUtil.convert(xmlData);
        DocumentProcessorUtil.convert(binaryData);
        DocumentProcessorUtil.convert(xmlData);

        System.out.println(DocumentProcessorUtil.convert(xmlData).toString());






    }
}
