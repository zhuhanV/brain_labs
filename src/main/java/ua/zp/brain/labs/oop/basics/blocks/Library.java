package main.java.ua.zp.brain.labs.oop.basics.blocks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Library {
    private Film[] arrFilms;
    private final String nameLibrary = "MyLibrary";

    public Film[] getArrFilms() {
        return arrFilms;
    }

    public void setArrFilms(Film[] arrFilms) {
        this.arrFilms = arrFilms;
    }

    public String getNameLibrary() {
        return nameLibrary;
    }

    {
        arrFilms = new Film[5];
        arrFilms[0] = new Film("Mahabharata", 180.3, Film.HISTORICAL_DRAMA);
        arrFilms[1] = new Film("Confucius", 120.5, Film.BIOGRAPHY);


        System.out.println("Added favorite movies");
    }

    public Library() {
        System.out.println("Library " + getNameLibrary() + " successfully created");
    }

    public int goIndex () {

        for (int i = 0; i < arrFilms.length; i++) {
         if (arrFilms[i]==null)return i;
        }
        return -1;
    }

}


