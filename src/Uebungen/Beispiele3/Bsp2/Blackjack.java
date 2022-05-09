package Uebungen.Beispiele3.Bsp2;

import java.util.HashMap;

public class Blackjack {
    private HashMap<Player, Integer> map = new HashMap<>();

    public boolean add(Player player) {
        if(!map.containsKey(player)) {
            map.put(player, 0);
            return true;
        }
        return false;
    }

    public boolean addCard(Player player, Integer cardValue) {
        if(map.containsKey(player)) {
            int wert = map.get(player);
            map.put(player, (wert + cardValue));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Blackjack{" +
                "map=" + map +
                '}';
    }
}
