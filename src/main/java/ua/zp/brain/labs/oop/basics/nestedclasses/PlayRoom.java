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
        gamesVirtual[0] = Game.getVirtualGame("Strike", Ganre.RACE, 10);
        gamesVirtual[1] = Game.getVirtualGame("ContreStrike", Ganre.RACE, 5);
        gamesVirtual[2] = Game.getVirtualGame("World of Tanks", Ganre.ACTION, 8);
        gamesVirtual[3] = Game.getVirtualGame("World of world", Ganre.ACTION, 10);

        Arrays.sort(gamesDisk, new Comparator<Game.GameDisk>() {
            @Override
            public int compare(Game.GameDisk gameDisk1, Game.GameDisk gameDisk2) {
                return gameDisk1.getData().getGanre().compareTo(gameDisk2.getData().getGanre());
            }
        });
        System.out.println(Arrays.toString(gamesDisk));

        Arrays.sort(gamesVirtual, new Comparator<Game.VirtualGame>() {
            @Override
            public int compare(Game.VirtualGame virtualGame1, Game.VirtualGame virtualGame2) {
                return Integer.compare(virtualGame1.getRating(), virtualGame2.getRating());
            }
        });
        System.out.println(Arrays.toString(gamesVirtual));

        GameConsole gameConsole = new GameConsole(Brand.SONY, "p09k");
        gameConsole.loadGame(new Game("Strike", Ganre.RACE, Game.Type.PHYSICAL));
        gameConsole.playGame();

    }
}

