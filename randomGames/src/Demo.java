import java.util.Scanner;

public class Demo {
    static Scanner sc = new Scanner(System.in);
    static boolean temp;
    public static void main(String[] args) {
        do{
            Player player = new Player();
            player.playerInput();


            AnswerGen answerGen = new AnswerGen();
            answerGen.answerGen();

            Compare.compare(player, answerGen);

            System.out.print("Do you want to continue? (y/n) >>> ");
            char answer = sc.next().charAt(0);
            if (answer == 'y'){
                temp = true;
            } else if (answer == 'n'){
                temp = false;
            }
        } while(temp);

    }
}

