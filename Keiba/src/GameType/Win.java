package GameType;

import java.util.Scanner;
//import src.*;

public class Win extends Game{ //単勝
    static Scanner sc = new Scanner(System.in);
    private static final String name = "Win";
    private int guess;

    public Win() {
    }

    public Win(int guess) {
        this.guess = guess;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess() {
        System.out.print("Guess which hours wins (1 to 12) >>> ");
        guess = sc.nextInt();
    }

    public static String getGameName() {
        return name;
    }

    public String result(int guess, String race){ //how can i import package?
        System.out.println("race: " + race);
        System.out.println("guess: " + guess);
        if (guess == 0){ //the data of index of 0 of resultArray.
            System.out.println("tester");
            return "correct";
        } else {
            System.out.println("incorrect");
            return "incorrect";
        }
    }
}
