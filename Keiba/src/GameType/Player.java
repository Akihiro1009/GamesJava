package GameType;

public class Player {
    private int money;
    private int amount;

    public Player() {
        this.money = 10000;
    }

    public Player(int money, int amount) {
        this.money = money;
        this.amount = amount;
    }

    public int getMoneyPrice(){
        return this.money;
    }

    public void getMoney() {
        System.out.println("You have: ¥" + money );
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void bet(int amount) {
        if (amount <= money){
            money -= amount;
        } else {
            System.out.println("No bet price too high!");
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void win(int amount){
        money += amount;
    }

    public void lose(int amount){
        money -= amount;
    }
}
