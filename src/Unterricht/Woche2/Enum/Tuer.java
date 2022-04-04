package Unterricht.Woche2.Enum;

public class Tuer {
    private int breite;
    private int hoehe;
    private Himmelsrichtung oeffnungsRichtung;

    public Tuer(int breite, int hoehe, Himmelsrichtung oeffnungsRichtung) {
        this.breite = breite;
        this.hoehe = hoehe;
        this.oeffnungsRichtung = oeffnungsRichtung;

    }

    public Himmelsrichtung getOeffnungsRichtung() {
        return oeffnungsRichtung;
    }

    public void setOeffnungsRichtung(Himmelsrichtung oeffnungsRichtung) {
        this.oeffnungsRichtung = oeffnungsRichtung;
    }

    @Override
    public String toString() {
        return "Tuer{" +
                "breite=" + breite +
                ", hoehe=" + hoehe +
                ", tuerOeffnet=" + oeffnungsRichtung +
                '}';
    }
}


