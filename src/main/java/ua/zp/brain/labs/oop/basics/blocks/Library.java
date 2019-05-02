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
        arrFilms[0] = new Film("Mahabharata", 180.3, "");
        arrFilms[1] = new Film("Confucius", 120.5, "");


        System.out.println("Added favorite movies");
    }

    public Library() {
        System.out.println("Library " + getNameLibrary() + " successfully created");
    }


}


