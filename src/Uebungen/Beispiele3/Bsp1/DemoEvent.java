package Uebungen.Beispiele3.Bsp1;

public class DemoEvent {
    public static void main(String[] args) {
        Event e1 = new Event("Konzert", "Graz", 60);
        Event e2 = new Event("Konzert", "Wien", 80);
        Event e3 = new Event("Theater", "Graz", 30);
        Event e4 = new Event("Theater", "Wien", 40);
        Event e5 = new Event("Ausstellung", "Graz", 20);

        EventKalender events = new EventKalender();
        events.add(e1);
        events.add(e2);
        events.add(e3);
        events.add(e4);
        events.add(e5);

        System.out.println(events);
        System.out.println(events.getByTitle("Theater"));
        System.out.println(events.getByOrt("Graz"));
        System.out.println(events.getByEintrittsPreis(40, 70));
        System.out.println("****************");
        System.out.println(events.getMostExpensiveByOrt("Wien"));
        System.out.println(events.getAvgPreisByOrt("Graz"));
        System.out.println("****************");

        System.out.println(events.getCountEventsByOrt());
        System.out.println(events.getSumPriceEventsByOrt());
    }
}
