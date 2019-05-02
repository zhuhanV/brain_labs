package main.java.ua.zp.brain.labs.oop.basics.blocks;

public class Film {
    private String name;
    private double duration;
    private String genre;
    public static final String COMEDY = "comedy";
    public static final String FANTASTIC = "fantastic";
    public static final String HISTORICAL_DRAMA = "historical drama";
    public static final String BIOGRAPHY = "biography";
    public static final String HORRORS = "horrors";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Film(String name, double duration, String genre) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        System.out.println("Movie \"" + getName() + "\" successfully created");
    }

    {
        System.out.println("Creates a new film");
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                '}';
    }
}
