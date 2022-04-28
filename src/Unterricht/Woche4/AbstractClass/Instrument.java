package Unterricht.Woche4.AbstractClass;

public abstract class Instrument {
    public int lautstaerke;

    public Instrument(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

    public abstract int play(); // abstract methode zwingt alle extended klassen dazu diese methode zu overwriten

}
