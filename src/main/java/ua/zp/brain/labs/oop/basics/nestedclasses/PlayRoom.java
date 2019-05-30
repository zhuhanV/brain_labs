package ua.zp.brain.labs.oop.basics.nestedclasses;

import java.util.Arrays;
import java.util.Comparator;

public class PlayRoom {
    public static void main(String[] args) {
        Game.GameDisk[] gamesDisk = new Game.GameDisk[4];
        gamesDisk[0] = Game.getDisk("Lego", Ganre.ACTION, "WOW");
        gamesDisk[1] = Game.getDisk("Marvell", Ganre.RACE, "WOWOW");
        gamesDisk[2] = Game.getDisk("World", Ganre.SPORT, "WOW");
        gamesDisk[3] = Game.getDisk("LegoBetmen", Ganre.ACTION, "WOWOWOW");
        Game.VirtualGame[] gamesVirtual = new Game.VirtualGame[4];
        gamesVirtual[0] = Game.getVirtualGame("Strike", Ganre.RACE);
        gamesVirtual[1] = Game.getVirtualGame("ContreStrike", Ganre.RACE);
        gamesVirtual[2] = Game.getVirtualGame("World of Tanks", Ganre.ACTION);
        gamesVirtual[3] = Game.getVirtualGame("World of world", Ganre.ACTION);

        GameConsole gameConsole = new GameConsole(Brand.SONY, "258kj25");

             Arrays.sort(gamesDisk, new Comparator<Game.GameDisk>() {
            @Override
            public int compare(Game.GameDisk gameDisk1, Game.GameDisk gameDisk2) {
                Ganre ganre1 = gameDisk1.getData().getGanre();
                Ganre ganre2 = gameDisk2.getData().getGanre();
                int v = ganre1.compareTo(ganre2);
                return v;
            }
        });
        System.out.println(Arrays.toString(gamesDisk));

    }
}

