package main.java.ua.zp.brain.labs.oop.basics.methods;

public class Book {
    static String shop;
    private int id;
    private String name;
    private String author;
    private int page;
    private int chapter;
    private String chapters;
    private int price;
    private String language;
    private String genre;
    private int yearOfPublication;
    private String cover;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public static String getShop() {
        return shop;
    }

    public static void setShop(String shop) {
        Book.shop = shop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getChapters() {
        return chapters;
    }

    public void setChapters(String chapters) {
        this.chapters = chapters;
    }

    public int goPage(int pageStart) {
        int pageNext = pageStart + 1;
        return pageNext;
    }

    public int goChapter(int chapterStart) {
        int chapterNext = chapterStart + 1;
        return chapterNext;
    }

    public void viewChapters() {
        System.out.println(this.chapters);
    }


}
