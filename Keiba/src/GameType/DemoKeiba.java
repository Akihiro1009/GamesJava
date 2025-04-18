package GameType;
//todo into src folder

public class DemoKeiba {
    public static void main(String[] args) {
        //GameType.MenuKeiba.menu();

        Win win1 = new Win();
        win1.setGuess();

        Race2 race2 = new Race2();
        race2.startGame();
        System.out.println("----------------------");

        win1.result(win1.getGuess(), race2.getWinner1());

        //Game game = new Game();
        //game.getGameNames();

        //Race.setWinner();
    }
}
