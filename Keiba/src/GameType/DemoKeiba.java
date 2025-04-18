package GameType;
//todo into src folder

public class DemoKeiba {
    public static void main(String[] args) {
        System.out.println("Welcome to Keiba!");
        Player p1 = new Player();
        p1.getMoney();

        GameType.MenuKeiba.menu(p1);

        //-----------------------------------
        System.out.println("----------------------");
        System.out.println(p1.getMoneyPrice());
        int profit = p1.getMoneyPrice() - 10000;
        System.out.println("Your total profit is ¥" + profit);
    }
}
