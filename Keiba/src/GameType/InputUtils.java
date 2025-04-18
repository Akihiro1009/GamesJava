package GameType;
//todo into src folder

import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class InputUtils {
    static Scanner sc = new Scanner(System.in);

    public String question(List<String> suggestion, String question) {
        List<String> lowerSuggestion = suggestion.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        while(true){
            System.out.print(question);
            String answer = sc.nextLine().toLowerCase();


            if(answer.equals("-1")){
                System.exit(0);
            }
            if(lowerSuggestion.contains(answer)){
                return answer;
            }
            System.out.println(" >>> ERROR: try again");
        }
    }
}
