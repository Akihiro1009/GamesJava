
public class Compare {
    static int score;
    public static void compare(Player guess, AnswerGen answer) {
        System.out.println("Your guess is " + guess.guess1);

        if (guess.guess1 == answer.ans1) {
            score += 1000;
        } else if (guess.guess1 == answer.ans2) {
            score += 500;
        } else if (guess.guess1 == answer.ans3) {
            score += 100;
        }

        System.out.println("Your score is " + score);
    }
}

