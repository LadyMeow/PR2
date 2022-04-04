package Unterricht.Woche2.Generics;

public class Maybe<T> {
    private T data;
    private int status;

    // generische Version der Klasse - der Typ T wird dann ersetzt durch konkreten Typ
    // nach Erzeugung einer Instanz

    public Maybe(T data, int status) {
        this.data = data;
        this.status = status;
    }

    public void print() {
        switch (status){
            case 1:
                System.out.println("Zugriff gewährt: " + data);
                break;
            case 2:
                System.out.println("Geht dich nichts an!");
                break;
            case 3:
                System.out.println("Daten nicht erfasst!");
                break;
            default:
                System.out.println("Bitte Status zwischenn 1-3 wählen!");
                break;
        }
    }
}
