
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        player.playerInput();

        AnswerGen.answerGen();

        Compare.compare(player);
    }
}

