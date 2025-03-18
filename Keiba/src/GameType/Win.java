package GameType;

import java.util.Scanner;
//import src.*;

public class Win extends Game{ //単勝
    static Scanner sc = new Scanner(System.in);
    private static final String name = "Win";
    private String guess;

    public Win() {
    }
    public Win(String guess) {
        this.guess = guess;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess() {
        System.out.println("Guess which hours wins.");
        String tempGuess = sc.nextLine();

        guess = tempGuess;
    }

    public static String getGameName() {
        return name;
    }

    public String win(Win guess, Race2 race){ //how can i import package?
        if (guess.equals(race[0]))

        return null;
    }
}
