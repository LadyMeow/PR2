package Uebungen.Beispiele1.Bsp2;

import java.util.ArrayList;

public class CrazyLabyrinthApp {
    public static void main(String[] args) {

        LabyrinthTile t1 = new LabyrinthTile(Direction.UP, Direction.DOWN);
        LabyrinthTile t2 = new LabyrinthTile(Direction.UP, Direction.LEFT);
        LabyrinthTile t3 = new LabyrinthTile(Direction.RIGHT, Direction.LEFT);

        LabyrinthTile[] path = new LabyrinthTile[]{t1, t2, t3};

        System.out.println(CrazyLabyrinth.checkPathConsistency(path));

    }
}
