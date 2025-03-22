import GameType.Race2;
import GameType.Win;

import java.awt.*;

public class DemoKeiba {
    public static void main(String[] args) {
        MenuKeiba.menu();

        Win win = new Win();
        win.setGuess();

        Race2 race = new Race2();
        race.startGame();

        win.win(win, race);

        //Game game = new Game();
        //game.getGameNames();

        //Race.setWinner();
    }
}
