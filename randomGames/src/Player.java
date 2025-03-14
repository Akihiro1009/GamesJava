
import java.util.Scanner;

public class Player {
    static Scanner sc = new Scanner(System.in);
    int guess1;
    //int guess2;
    //int guess3;

    public Player() {
    }

    public void playerInput(){
        System.out.print("Make a guess 1 to 10 >>> ");
        guess1 = sc.nextInt();
        /*System.out.println("Make second guess 1 to 10 >>> ");
        guess2 = sc.nextInt();
        System.out.println("Make third guess 1 to 10 >>> ");
        guess3 = sc.nextInt();*/

    }

}

