package GameType;

import java.util.*;

public class Race2 {
    public Race2() {
    }

    public static String[] runner = {"h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "h10", "h11", "h12"};

    public static String[] result = new String[runner.length];

    public void startGame(){
        List<String> runnerList = Arrays.asList(runner);
        Collections.shuffle(runnerList); //using shuffle() to shuffle the order.
        result = runnerList.toArray(result);

        //What is (String r : result)?
        for (String r : result) {
            System.out.println(r);
        }

        System.out.println("----------------------");

        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }

        System.out.println("----------------------");

        //it is already converted into Array, so no need this execution.
        /*for (int i = 1; i < result.length; i++) {
            result[i] = runnerList.get(i - 1);
            System.out.println(result[i]);
        }*/

        //List<String>


        /*for (int i = 0; i < runner.length; i++){
            Random temp = new Random();

            result[i] = runner[temp.nextInt(runner.length)];

            System.out.println(result[i]);
        }*/
    }

    public static void main(String[] args) {
        Race2 r = new Race2();
        r.startGame();
        System.out.println("done execution");
    }
}
