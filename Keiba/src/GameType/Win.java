package GameType;

import java.util.List;
import java.util.Scanner;

public class Win extends Game{ //単勝
    private Player player;
    static Scanner sc = new Scanner(System.in);
    private static final String name = "Win";
    private int guess;

    public Win() {
    }

    public Win(Player player) {
        this.player = player;
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

    public void setWinBet() {
        System.out.print("How much do you want to bet? >>>> ");
        int tempAmount = sc.nextInt();
        player.setAmount(tempAmount);
        player.bet(tempAmount);
    }

    public static String getGameName() {
        return name;
    }

    public String result(int guess, Horses winnerHorse, int betAmount){
        System.out.println("Your guess: " + guess);
        System.out.println("winner >>> " + winnerHorse);
        System.out.println("----------------------");
        if (guess == winnerHorse.getNumber()){
            System.out.println("🎉congratulations!🎉");
            int payout = betAmount * 10;
            player.win(payout);
            player.getMoney();
            return "tester";
        } else {
            System.out.println("sorry... Your guess was wrong.");
            player.getMoney();
            return "tester";
        }
    }
}
