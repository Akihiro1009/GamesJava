package GameType;
//todo into src folder

import java.util.Arrays;
import java.util.List;

public class MenuKeiba {
    public static void menu(){
        InputUtils input = new InputUtils();

        String[] gameName = {"Win", "Trio", "Trifecta", "QuinellaPlace", "Quinella", "Place", "Exact"};

        switch (input.question(List.of(gameName), Arrays.toString(gameName) + "\nEnter Ticket you want to buy >>> ")){
            case "win":
                while (true) {
                    Win win = new Win();
                    win.setGuess();
                    Race2 race2 = new Race2();
                    race2.startGame();
                    win.result(win.getGuess(), race2.getWinner1());

                    switch (input.question(List.of("y","n"),"Do you want to continue? ")){
                        case "y":
                            break;
                        case "n":
                            return;
                    }
                }

            case "trio":
                break;

            case "trifecta":
                break;

            case "quinellaPlace":
                break;

            case "quinella":
                break;

            case "place":
                break;

            case "exact":
                break;
        }
    }
}
