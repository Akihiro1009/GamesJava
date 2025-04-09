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
        System.out.print("Guess which hours wins (1 to 12) >>> ");
        String tempGuess = sc.nextLine();

        guess = tempGuess;
    }

    public static String getGameName() {
        return name;
    }

    public String result(Win guess, Race2 race){ //how can i import package?
        //todo why isn't it working????????
        if (guess.equals(race)){ //the data of index of 0 of resultArray.
            System.out.println("tester");
            return "correct";
        } else {
            return "incorrect";
        }
    }



}
