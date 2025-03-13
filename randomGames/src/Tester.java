import java.util.Random;
import java.util.Scanner;

public class Tester {
    static Scanner sc = new Scanner(System.in);
    static int score;

    public static void main(String[] args) {
        System.out.print("Make first guess 1 to 10 >>> ");
        int guess1 = sc.nextInt();
        /*System.out.println("Make second guess 1 to 10 >>> ");
        int guess2 = sc.nextInt();
        System.out.println("Make third guess 1 to 10 >>> ");
        int guess3 = sc.nextInt();
        */

        Random rand1 = new Random();
        int ans1 = rand1.nextInt(10) + 1;
        Random rand2 = new Random();
        int ans2 = rand2.nextInt(10) + 1;
        Random rand3 = new Random();
        int ans3 = rand3.nextInt(10) + 1;
        System.out.println("===FirstGen===");
        System.out.println(" >>> ans1: " + ans1);
        System.out.println(" >>> ans2: " + ans2);
        System.out.println(" >>> ans3: " + ans3);
        System.out.println("==============");

        while (ans1 == ans2) {
            System.out.println("---loop---");
            System.out.println("Before: " + ans1 + ":" + ans2);
            rand1 = new Random();
            ans1 = rand1.nextInt(10) + 1;
            System.out.println("ans1: " + ans1);
            System.out.println("ans2: " + ans2);
            System.out.println("---end---");
        }
        while (ans2 == ans3) {
            System.out.println("---loop---");
            System.out.println("Before: " + ans2 + ":" + ans3);
            rand3 = new Random();
            ans3 = rand3.nextInt(10 + 1);
            System.out.println("ans2: " + ans2);
            System.out.println("ans3: " + ans3);
            System.out.println("---end---");
        }

        System.out.println(">>>>>result<<<<<");
        System.out.println(" >>> ans1: " + ans1);
        System.out.println(" >>> ans2: " + ans2);
        System.out.println(" >>> ans3: " + ans3);
        System.out.println(">>>>>>>><<<<<<<<");




        if(guess1 == ans1){
            System.out.println("Your guess is same as answer1");
            score += 1000;
        } else if(guess1 == ans2){
            System.out.println("Your guess is same as answer2");
            score += 500;
        } else if(guess1 == ans3){
            System.out.println("Your guess is same as answer3");
            score += 100;
        } else{
            System.out.println("Your guess was wrong");
        }
        System.out.println("Your score is : " + score);

        /*public static void compare(guess1, guess2, guess3) {
            System.out.println(guess1);
            System.out.println(guess2);
            System.out.println(guess3);
        }*/
    }
}
