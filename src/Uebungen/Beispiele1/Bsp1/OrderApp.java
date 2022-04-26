package Uebungen.Beispiele1.Bsp1;

import Uebungen.Beispiele1.Bsp1.Article;
import Uebungen.Beispiele1.Bsp1.Order;

public class OrderApp {
    public static void main(String[] args) {
        Article a1 = new Article("Kürbis", 1, 2.4);
        Article a2 = new Article("Apfel", 2, 0.6);
        Article a3 = new Article("Beeren", 3, 1.8);
        Article a4 = new Article("Badewanne", 1, 100);

        Order o1 = new Order(3);
        o1.addArticle(a1);
        o1.addArticle(a2);
        o1.addArticle(a3);

        System.out.println(o1);
        System.out.println("most expensive article: " + o1.findMostExpensiveArticle());
        System.out.println("most expensive order position: " + o1.findMostExpensiveOrderPosition());
        System.out.println("sum order netto: " + o1.sumOrder());
        System.out.println("tax: " + o1.calculateTax());
        System.out.println("sum order brutto: " + o1.sumOrderWithTax());

        // add obwohl capacity zu klein
        o1.addArticle(a4);
        System.out.println(o1);

        o1.removeArticle(4);
        System.out.println(o1);

    }
}
