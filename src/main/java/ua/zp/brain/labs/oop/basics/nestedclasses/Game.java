package ua.zp.brain.labs.oop.basics.nestedclasses;

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

    static class GameDisk {
        final String description;
        final Game data;
         private GameDisk (String name, Ganre ganre, String description) {
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
            return "GameDisk{" +
                    "description='" + description + '\'' +
                    ", data=" + data +
                    '}';
        }
    }

    static class VirtualGame {
        private int rating;
        final Game data;

        private VirtualGame (String name, Ganre ganre) {
            this.data = new Game(name,ganre, Type.VIRTUAL);
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
    }

    static GameDisk getDisk (String name, Ganre ganre, String description) {
        GameDisk gameDisk = new GameDisk(name,ganre,description);
        return gameDisk;
    }

    static VirtualGame getVirtualGame (String name, Ganre ganre) {
        VirtualGame gameDisk = new VirtualGame(name,ganre);
        return gameDisk;
    }


    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", ganre=" + ganre +
                ", type=" + type +
                '}';
    }
}
