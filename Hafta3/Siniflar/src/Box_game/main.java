package Box_game;

public class main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("A", 10 ,120, 100,100);
        Fighter f2 = new Fighter("B", 20 ,85, 100,0);

        Match match = new Match(f1,f2,20,120);

        match.run();
    }
}
