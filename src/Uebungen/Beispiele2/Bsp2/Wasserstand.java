package Uebungen.Beispiele2.Bsp2;

public class Wasserstand {
    private int Id;
    private String GewaesserName;
    private String Ort;
    private double messWert;
    private double messWertFuerAlarmierung;
    private int Zeitpunkt;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getGewaesserName() {
        return GewaesserName;
    }

    public void setGewaesserName(String gewaesserName) {
        GewaesserName = gewaesserName;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public double getMessWert() {
        return messWert;
    }

    public void setMessWert(double messWert) {
        this.messWert = messWert;
    }

    public double getMessWertFuerAlarmierung() {
        return messWertFuerAlarmierung;
    }

    public void setMessWertFuerAlarmierung(double messWertFuerAlarmierung) {
        this.messWertFuerAlarmierung = messWertFuerAlarmierung;
    }

    public int getZeitpunkt() {
        return Zeitpunkt;
    }

    public void setZeitpunkt(int zeitpunkt) {
        Zeitpunkt = zeitpunkt;
    }

    @Override
    public String toString() {
        return "Wasserstand{" +
                "Id=" + Id +
                ", GewaesserName='" + GewaesserName + '\'' +
                ", Ort='" + Ort + '\'' +
                ", messWert=" + messWert +
                ", messWertFuerAlarmierung=" + messWertFuerAlarmierung +
                ", Zeitpunkt=" + Zeitpunkt +
                '}';
    }
}
