import java.util.Random;

public class AnswerGen {
    public static void answerGen(){
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

        while(ans1 == ans2){
            System.out.println("---loop---");
            System.out.println("Before: " + ans1 + ":" + ans2);
            rand1 = new Random();
            ans1 = rand1.nextInt(10) + 1;
            System.out.println("ans1: " + ans1);
            System.out.println("ans2: " + ans2);
            System.out.println("---end---");
        } while(ans2 == ans3){
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
    }
}
