import GameType.Win;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class MenuKeiba {
    public static void menu(){
        InputUtils input = new InputUtils();

        String[] gameName = {"Win", "Trio", "Trifecta", "QuinellaPlace", "Quinella", "Place", "Exact"};

        switch (input.question(List.of(gameName), Arrays.toString(gameName) + "\nEnter Ticket you want to buy >>> ")){
            case "win":
                Win win = new Win();
                win.getGuess();
            break;

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
