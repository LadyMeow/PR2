package Unterricht.Woche5.Sortieren;

public class MitarbeiterIn implements Comparable<MitarbeiterIn> {
    private String vname;
    private String zname;
    private int geburtsjahr;

    // constructor
    public MitarbeiterIn(String vname, String zname, int geburtsjahr) {
        this.vname = vname;
        this.zname = zname;
        this.geburtsjahr = geburtsjahr;
    }

    // getter u. setter
    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    @Override
    public String toString() {
        return "MitarbeiterIn{" +
                "vname='" + vname + '\'' +
                ", zname='" + zname + '\'' +
                ", geburtsjahr=" + geburtsjahr +
                '}';
    }

//     wir müssen diese methode anpasse, je nachdem nach was wir sortieren wollen
//     nach Alter, wir starten mit der jüngsten Person
    @Override
    public int compareTo(MitarbeiterIn o) {
        if(this.geburtsjahr > o.geburtsjahr) {
            return -1;
        }
        if(this.geburtsjahr < o.geburtsjahr) {
            return 1;
        }
        return 0;
    }

}
