import java.util.Random;

public class Race2 {
    public static String[] runner = {"h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "h10", "h11", "h12"};

    public static String[] result = new String[runner.length];

    public static void setWinner(){
        //List<String>


        /*for (int i = 0; i < runner.length; i++){
            Random temp = new Random();

            result[i] = runner[temp.nextInt(runner.length)];

            System.out.println(result[i]);
        }*/
    }

    public static void main(String[] args) {
        setWinner();
        System.out.println("done execution");
    }
}
