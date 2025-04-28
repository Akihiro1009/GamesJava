package GameType;

import java.util.Scanner;

public class Quinella extends Game{ //馬連
    private Player player;
    static Scanner sc = new Scanner(System.in);
    private static final String name = "Quinella";
    private int guess1;
    private int guess2;

    public Quinella() {
    }

    public Quinella(String gameName) {
        super(gameName);
    }

    public Quinella(Player player) {
        this.player = player;
    }

    public int getGuess1(){
        return guess1;
    }
    public int getGuess2(){
        return guess2;
    }

    public void setGuess() {
        System.out.print("Make a first guess (1 to 12) >>> ");
        guess1 = sc.nextInt();
        System.out.print("Make a second guess (1 to 12) >>> ");
        guess2 = sc.nextInt();
        if (guess1 == guess2) {
            System.out.println("Your second guess is the same");
            setGuess();
        }
    }

    public void setQuinellaBet(){
        System.out.print("How much do you want to bet? >>> ");
        int betPrice = sc.nextInt();
        player.setAmount(betPrice);
        player.bet(betPrice);
    }

    public static String getGameName(){
        return name;
    }

    public String result(int guess1, int guess2, Horses winnerHorse1, Horses winnerHorse2, int betAmount){
        if ((guess1 == winnerHorse1.getNumber() && guess1 == winnerHorse2.getNumber()) ||
            (guess2 == winnerHorse1.getNumber() && guess2 == winnerHorse2.getNumber())) { //ここのシステムの作り方。
            System.out.println("🎉congratulations!🎉");
            int payout = betAmount * 100;
            player.win(payout);
            player.getMoney();
            return "tester";
        } else {
            System.out.println("sorry... Your guess was wrong.");
            player.getMoney();
            return "tester";
            //commitment236
        }
    }
}
