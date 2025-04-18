package GameType;
//todo I want to put this class in src package.

public class Horses {
    private int number;
    private String hname;

    public Horses(int number, String hname) {
        this.number = number;
        this.hname = hname;
    }

    public int getNumber() {
        return number;
    }

    public String getHname() {
        return hname;
    }

    @Override
    public String toString() {
        return number + ":" + hname;
    }
}
