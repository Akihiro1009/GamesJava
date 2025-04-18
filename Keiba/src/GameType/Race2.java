package GameType;
//todo into src folder

import java.util.*;


public class Race2 {
    private static Horses winner1;
    private static Horses winner2;
    private static Horses winner3;

    public Race2() {
    }

    Horses horse1 = new Horses(1,"horse1");
    Horses horse2 = new Horses(2,"horse2");
    Horses horse3 = new Horses(3,"horse3");
    Horses horse4 = new Horses(4,"horse4");
    Horses horse5 = new Horses(5,"horse5");
    Horses horse6 = new Horses(6,"horse6");
    Horses horse7 = new Horses(7,"horse7");
    Horses horse8 = new Horses(8,"horse8");
    Horses horse9 = new Horses(9,"horse9");
    Horses horse10 = new Horses(10,"horse10");
    Horses horse11 = new Horses(11,"horse11");
    Horses horse12 = new Horses(12,"horse12");

    static int i = 1;
    public void startGame(){
        ArrayList<Horses> horseList = new ArrayList<>();
        horseList.add(horse1);
        horseList.add(horse2);
        horseList.add(horse3);
        horseList.add(horse4);
        horseList.add(horse5);
        horseList.add(horse6);
        horseList.add(horse7);
        horseList.add(horse8);
        horseList.add(horse9);
        horseList.add(horse10);
        horseList.add(horse11);
        horseList.add(horse12);

        Collections.shuffle(horseList);
        for(Horses horse : horseList){
            System.out.println(horse);
        }

        /*int j = 1;
        for (int i = 0; i < 3; i++) {
            Horses horse = horseList.get(i);
            System.out.println("Winner" + j + ": " + horse);
            j++;
        }*/

        winner1 = horseList.get(0);
        winner2 = horseList.get(1);
        winner3 = horseList.get(2);
        System.out.println("----------------------");
        System.out.println("winndre1 = " + winner1);
        System.out.println("winndre2 = " + winner2);
        System.out.println("winndre3 = " + winner3);
    }

    public static void main(String[] args) {
        Race2 r = new Race2();
        r.startGame();
        System.out.println("done execution");
    }

    public Horses getWinner1() {
        return winner1;
    }

    /*public Horses getWinners() {
        return winner1 + winner2 + winner3;
    }*/

    public Horses getHorse1() {
        return horse1;
    }
}
