package GameType;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private String gameName;
    private ArrayList<String > games;

    public Game(String gameName) {
        this.gameName = gameName;
    }



    /* should I use enum?
    enum Games{

    }
    */


    public String getGameName() {
        return gameName;
    }
}
