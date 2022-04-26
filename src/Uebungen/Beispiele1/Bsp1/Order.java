package Uebungen.Beispiele1.Bsp1;

import Uebungen.Beispiele1.Bsp1.Article;

import java.util.Arrays;

public class Order {
    private int nrArticles;
    private int capacityOrder;
    private Article[] articles;

    public Order(int capacityOrder) {
        nrArticles = 0;
        this.capacityOrder = capacityOrder;
        articles = new Article[capacityOrder];
    }

    public int getNrArticles() {
        return nrArticles;
    }

    public int getCapacityOrder() {
        return capacityOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "nrArticles=" + nrArticles +
                ", capacityOrder=" + capacityOrder +
                ", articles=" + Arrays.toString(articles) +
                '}';
    }

    public void addArticle(Article a) {
        if (nrArticles >= capacityOrder) {
            increaseArray();
        }
        articles[nrArticles] = a;
        nrArticles++;
    }

    public int findMostExpensiveArticle() {
        int highest = 0;
        for (int i = 1; i < articles.length; i++) {
            if (articles[i].getPrice() > articles[highest].getPrice()) {
                highest = i;
            }
        }
        return highest + 1;
    }

    public int findMostExpensiveOrderPosition() {
        int highest = 0;
        for (int i = 1; i < articles.length; i++) {
            if ((articles[i].getPrice() * articles[i].getNumber()) > (articles[highest].getPrice() * articles[highest].getNumber())) {
                highest = i;
            }
        }
        return highest + 1;
    }

    public double sumOrder() {
        double sum = 0;
        for (Article a : articles) {
            sum += (a.getPrice() * a.getNumber());
        }
        return sum;
    }

    public double calculateTax() {
        double sum = 0;
        for (Article a : articles) {
            if (a.getPrice() < 20) {
                sum += (a.getPrice() * 0.05);
            } else {
                sum += (a.getPrice() * 0.2);
            }
        }
        return sum;
    }

    public double sumOrderWithTax() {
        return calculateTax() + sumOrder();
    }

    private void increaseArray() {
        int newCapacity = capacityOrder + 1;
        Article[] newArticles = new Article[newCapacity];

        for (int i = 0; i < nrArticles; i++) {
            newArticles[i] = articles[i];
        }

        capacityOrder = newCapacity;
        articles = newArticles;
    }

    public void removeArticle(int nr) {
        int newCapacity = capacityOrder - 1;
        int newNr = nrArticles - 1;
        Article[] newArticles = new Article[newCapacity];

        for (int i = 0; i < nrArticles; i++) {
            if (i < nr) {
                newArticles[i] = articles[i];
            } else if (i >= nr) {
                newArticles[i - 1] = articles[i];
            }
        }

        capacityOrder = newCapacity;
        nrArticles = newNr;
        articles = newArticles;
    }
}
