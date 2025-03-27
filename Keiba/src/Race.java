import java.sql.Array;
import java.util.Random;

public class Race {
    public static String[] runner = {"h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "h10", "h11", "h12"};

    private static String winner1;
    private static String winner2;
    private static String winner3;

    public static void setWinner(){ //make winner random from runner[]
        Random temp1 = new Random();  //why is it okay only 1 temp1? don't I need 3 temp?
        winner1 = temp1.nextInt(runner.length)+""; //what is this +"" at the end?
        winner2 = temp1.nextInt(runner.length)+"";
        winner3 = temp1.nextInt(runner.length)+"";

        winner1 = runner[Integer.parseInt(winner1)];
        winner2 = runner[Integer.parseInt(winner2)];
        winner3 = runner[Integer.parseInt(winner3)];

        System.out.println("Winner 1: " + winner1 + "\nWinner 2: " + winner2 + " \nWinner 3: " + winner3);

    }

    public static String getWinner(){ //not working
        return "Winner1: " + winner1 +
                "\nWinnder2: " + winner2 +
                "\nWinnder3" + winner3;
    }

    public static void main(String[] args) {
            setWinner();
    }

    //dayle commi
}
