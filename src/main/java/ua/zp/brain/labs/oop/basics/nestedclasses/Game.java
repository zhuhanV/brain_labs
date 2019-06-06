package ua.zp.brain.labs.oop.basics.nestedclasses;

import java.util.Objects;

public class Game {
    final String name;
    final Ganre ganre;
    final Type type;

    enum Type {
        VIRTUAL, PHYSICAL;
    }

    public Game (String name, Ganre ganre, Type type) {
        this.name = name;
        this.ganre = ganre;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Ganre getGanre() {
        return ganre;
    }

    public Type getType() {
        return type;
    }

    static class GameDisk extends Game{
        final String description;
        final Game data;
         private GameDisk (String name, Ganre ganre, String description) {
             super(name, ganre,Type.PHYSICAL);
             this.data = new Game(name, ganre,Type.PHYSICAL);
             this.description = description;
         }

        public String getDescription() {
            return description;
        }

        public Game getData() {
            return data;
        }

        @Override
        public String toString() {
            return "\n" + "GameDisk: " +
                    "description: " + description +
                    ", data: " + data;
        }


    }

    static class VirtualGame {
        private int rating;
        final Game data;

        private VirtualGame(String name, Ganre ganre, int rating) {
            this.data = new Game(name, ganre, Type.VIRTUAL);
            this.rating = rating;
        }
        public int getRating() {
            return rating;
        }
        public void setRating(int rating) {
            this.rating = rating;
        }
        public Game getData() {
            return data;
        }


        @Override
        public String toString() {
            return "\n" + "VirtualGame: " +
                    "rating: " + rating +
                    ", data: " + data;
        }


    }

    static GameDisk getDisk (String name, Ganre ganre, String description) {
        GameDisk gameDisk = new GameDisk(name,ganre,description);
        return gameDisk;
    }

    static VirtualGame getVirtualGame(String name, Ganre ganre, int rating) {
        VirtualGame gameDisk = new VirtualGame(name, ganre, rating);
        return gameDisk;
    }


    @Override
    public String toString() {
        return "Game " + name +
                ", ganre: " + ganre +
                ", type: " + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;
        Game game = (Game) o;
        return Objects.equals(getName(), game.getName()) &&
                getGanre() == game.getGanre() &&
                getType() == game.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGanre(), getType());
    }
}
