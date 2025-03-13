import java.util.Scanner;

public class Player {
    static Scanner sc = new Scanner(System.in);

    public static void playerGuess(){ //how can i compare these guess and answer in different class.
        System.out.println("Make first guess 1 to 10 >>> ");
        int guess1 = sc.nextInt();
        System.out.println("Make second guess 1 to 10 >>> ");
        int guess2 = sc.nextInt();
        System.out.println("Make third guess 1 to 10 >>> ");
        int guess3 = sc.nextInt();

    }
}
