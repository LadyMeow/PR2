package Uebungen.Beispiele3.Bsp2;

public class DemoBJ {
    public static void main(String[] args) {
        Player p1 = new Player("Hansi", 70);
        Player p2 = new Player("Susi", 40);

        Blackjack game = new Blackjack();
        game.add(p1);
        game.add(p2);

        game.addCard(p1, 8);

        System.out.println(game);
    }
}
