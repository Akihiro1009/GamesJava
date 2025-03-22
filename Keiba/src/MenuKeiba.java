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
            case "Win":
                Win win = new Win();
                win.getGuess();
            break;

            case "Trio":
            break;

            case "Trifecta":
            break;

            case "QuinellaPlace":
            break;

            case "Quinella":
            break;

            case "Place":
            break;

            case "Exact":
            break;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
