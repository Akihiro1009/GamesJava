import GameType.Race2;
import GameType.Win;

import java.awt.*;

public class DemoKeiba {
    public static void main(String[] args) {
        MenuKeiba.menu();

        Win win1 = new Win();
        win1.setGuess();

        /*
        Race race1 = new Race();
        race1.setWinner();
        */

        Race2 race2 = new Race2();
        race2.startGame();
        System.out.println("---------");
        System.out.println("Winner1: " + race2.getWinner1());

        win1.result(win1, race2.getWinner1());

        //Game game = new Game();
        //game.getGameNames();

        //Race.setWinner();
    }
}
