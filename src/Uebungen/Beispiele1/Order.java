package Uebungen.Beispiele1;

import java.util.ArrayList;

public class Order {
    private int nrArticles;
    private int capacityOrder;
    private Article[] articles;

    public Order(int nrArticles, int capacityOrder, Article[] articles) {
        this.nrArticles++;
        this.capacityOrder = capacityOrder;
        //this.articles = Article[capacityOrder];
    }
}
