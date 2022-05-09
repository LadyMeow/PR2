package Uebungen.Beispiele1.Bsp2;

import java.util.ArrayList;

public class CrazyLabyrinth {
//    ArrayList<LabyrinthTile> path = new ArrayList<>();
//
//    public void addTile(LabyrinthTile t) {
//        path.add(t);
//    }

    public static boolean checkPathConsistency(LabyrinthTile[] path) {
        boolean consistency = true;
        for (int i = 0; i < path.length - 1; i++) {
            if(path[i].getExit() == Direction.UP && path[i + 1].getEntry() == Direction.DOWN) {

            } else if(path[i].getExit() == Direction.DOWN && path[i + 1].getEntry() == Direction.UP) {

            } else if(path[i].getExit() == Direction.LEFT && path[i + 1].getEntry() == Direction.RIGHT) {

            } else if(path[i].getExit() == Direction.RIGHT && path[i + 1].getEntry() == Direction.LEFT) {

            } else {
                consistency = false;
            }
        }
        return consistency;
    }
}
