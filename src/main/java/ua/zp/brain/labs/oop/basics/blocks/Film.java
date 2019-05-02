package ua.zp.brain.labs.oop.basics.blocks;

public class Film {
    private String name;
    private double duration;
    private String genre;
    private final String COMEDY = "comedy";
    private final String FANTASTIC = "fantastic";
    private final String HISTORICAL_DRAMA = "historical drama";
    private final String BIOGRAPHY = "biography";
    private final String HORRORS = "horrors";


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


    public String getCOMEDY() {
        return COMEDY;
    }

    public String getFANTASTIC() {
        return FANTASTIC;
    }

    public String getHISTORICAL_DRAMA() {
        return HISTORICAL_DRAMA;
    }

    public String getHORRORS() {
        return HORRORS;
    }

    public Film(String name, double duration, String genre) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        System.out.println("Movie " + getName() + " successfully created");
    }

    {
        System.out.println("Creates a new film");
    }
}
