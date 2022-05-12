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

    public Integer getValue(Player player) {
        if(map.containsKey(player)) {
            return map.get(player);
        }
        return null;
    }

    public Player getWinner() {
        int highest = 0;
        Player winner = new Player(null, 0);

        for (Player p : map.keySet()) {
            if(map.get(p) == highest) {
                return null;
            } else if(map.get(p) < 21 && map.get(p) > highest) {
                highest = map.get(p);
                winner = p;
            }
        }
        if (highest == 0) {
            return null;
        }
        return winner;
    }


    @Override
    public String toString() {
        return "Blackjack{" +
                "map=" + map +
                '}';
    }
}
