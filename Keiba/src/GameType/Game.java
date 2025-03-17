package GameType;

import java.util.ArrayList;

public class Game {
    private String gameName;
    private ArrayList<String > games;

    public Game(){

    }
    public Game(String gameName) {
        this.gameName = gameName;
    }



    /* should I use enum?
    enum Games{

    }
    */


    public void getGameNames() {
        System.out.println(Win.getGameName() + "\n" + Trio.getGameName());
    }

}
