package ua.zp.brain.labs.oop.basics.blocks;

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
        arrFilms[0] = new Film("Mahabharata", 180.3, new Film().getHistoricalDrama());
        arrFilms[1] = new Film("Confucius", 120.5, new Film().getBiography());


        System.out.println("Added favorite movies");
    }

    public Library() {
        System.out.println("Library " + getNameLibrary() + " successfully created");
    }

    public void searchIndex() {
        int a = 0;
        for (int i = 0; i < arrFilms.length; i++) {
            if (arrFilms[i] == null) {
                a = i;
            } else a = -1;
        }
        System.out.println(a);
    }
}


