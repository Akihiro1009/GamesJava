package GameType;

public class Trio extends Game{
    private static final String name = "Trio";
    public Trio(String gameName) {
        super(gameName);
    }

    public static String getGameName() {
        return name;
    }
}
