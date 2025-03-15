package GameType;

import java.util.Scanner;

public class Win extends Game{ //単勝
    private String guess;
    static Scanner sc = new Scanner(System.in);

    public Win(String gameName) {
        super(gameName);
    }

    public String getGuess() {
        System.out.println("Guess which hours wins.");

    }
}
