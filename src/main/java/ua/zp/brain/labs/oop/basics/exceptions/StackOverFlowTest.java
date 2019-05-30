package ua.zp.brain.labs.oop.basics.exceptions;

public class StackOverFlowTest {
    private static int count;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        StackOverFlowTest.count = count;
    }

    public static int test() {
        try {
            count++;
            test();
        } catch (StackOverflowError e) {
            System.out.println("Ошибка StackOverflowError");
        }
        return count;
    }

    public static void main(String[] args) {
        test();
    }
}
