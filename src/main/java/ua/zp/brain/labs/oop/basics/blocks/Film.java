package ua.zp.brain.labs.oop.basics.blocks;

public class Film {
    private String name;
    private double duration;
    private String genre;
    private final String comedy = "comedy";
    private final String fantastic = "fantastic";
    private final String historicalDrama = "historical drama";
    private final String biography = "biography";
    private final String horrors = "horrors";


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

    public String getComedy() {
        return comedy;
    }

    public String getFantastic() {
        return fantastic;
    }

    public String getHorrors() {
        return horrors;
    }

    public String getHistoricalDrama() {
        return historicalDrama;
    }

    public String getBiography() {
        return biography;
    }

    public Film() {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        System.out.println("Movie " + getName() + " successfully created");
    }

    public Film(String name, double duration, String genre) {
        this();
        this.genre = genre;
    }

    {
        System.out.println("Creates a new film");
    }
}
