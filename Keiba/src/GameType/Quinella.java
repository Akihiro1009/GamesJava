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

    public int getGuess(){
        return guess1 + guess2;
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
        System.out.println("How much do you want to bet? >>> ");
        int betPrice = sc.nextInt();
        player.setAmount(betPrice);
        player.bet(betPrice);
    }

    public static String getGameName(){
        return name;
    }

}
