package main.java.ua.zp.brain.labs.oop.basics.blocks;

public class Main {


    public static void main(String[] args) {
        Library l1 = new Library();
        int freeIndex = l1.goIndex();
        while (freeIndex > -1) {
            l1.getArrFilms()[freeIndex] = new Film("Random", 55, Film.COMEDY);
            freeIndex = l1.goIndex();
        }
        System.out.println("You have reached the limit");
        for (Film arr:l1.getArrFilms()){
            System.out.println(arr);
        }

        }

    }


