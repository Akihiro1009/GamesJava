import java.util.Scanner;
import java.util.List;

public class InputUtils {
    static Scanner sc = new Scanner(System.in);

    public String question(List<String> suggestion, String question) {
        while(true){
            System.out.print(question);
            String answer = sc.nextLine();

            if(answer.equals("-1")){
                System.exit(0);
            }
            if(suggestion.contains(answer)){
                return answer;
            }
            System.out.println(" >>> ERROR: try again");
        }
    }
}
