package ua.zp.brain.labs.oop.basics.exceptions;

import java.lang.reflect.Array;

public class ArrayExceptionTest {

    public static void main(String[] args) {

        int[] arrays = {1, 4, 5, 6, 5, 6};
        printArray(arrays, 7, 10);

    }

    static void printArray(int[] arrays, int start, int end) {
        for (int i = start; i < end; i++) {
            try {
                System.out.println(arrays[i]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Ошибка. Попытка обращения к" +
                        "несуществующему индексу: текущий индекс = " +
                        i + ", размер массива = " + end);
            }
        }
    }
}
