package GameType;

import java.util.List;
import java.util.Scanner;

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
        do {
            System.out.print("Guess which hours wins (1 to 12) >>> ");
            guess = sc.nextInt();
        } while (guess < 1 || guess > 12);
    }

    public static String getGameName() {
        return name;
    }

    public String result(int guess, Horses winnerHorse){ //how can i import package?
        System.out.println("winner: " + winnerHorse);
        System.out.println("number: " + winnerHorse.getNumber());
        System.out.println("guess: " + guess);
        if (guess == winnerHorse.getNumber()){
            return "correct";
        } else {
            System.out.println("incorrect");
            return "incorrect";
        }
    }
}
