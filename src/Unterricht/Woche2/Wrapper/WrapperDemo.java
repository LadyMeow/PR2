package Unterricht.Woche2.Wrapper;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer i = 22;
        int j = new Integer(25); // durchgestrichen da deprecated - einfach ohne Integer Konstruktor machen
        Integer k = null;

        System.out.println(i+j);
        System.out.println(j);
        System.out.println("*********************");

        int l = Integer.parseInt("16");
        System.out.println(l + 2);
        System.out.println("16" + 2);

    }
}
