package Unterricht.Woche4.Polymorphism;

public class Instrument {
    protected int lautstaerke;
    protected String name;

    public Instrument(int lautstaerke, String name) {
        this.lautstaerke = lautstaerke;
        this.name = name;
    }

    public int play() {
        lautstaerke = 0;
        System.out.println(name + " ist" + lautstaerke + " laut");
        return lautstaerke;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
