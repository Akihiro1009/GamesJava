import GameType.Race2;
import GameType.Win;

import java.awt.*;

public class DemoKeiba {
    public static void main(String[] args) {
        MenuKeiba.menu();

        Win win1 = new Win();
        win1.setGuess();

        Race2 race = new Race2();
        race.startGame();

        win1.result(win1, race);

        //Game game = new Game();
        //game.getGameNames();

        //Race.setWinner();
    }
}
