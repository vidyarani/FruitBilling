package com.tw.vapasi;

public class Fruit {
    private String name;
    private int perKgRate;
    public double orderCost;
    double quantity;

    Fruit() {
    }

    private Fruit(String name, int perKgRate, double quantity) {
        this.name = name;
        this.perKgRate = perKgRate;
        this.quantity = quantity;
        this.orderCost = quantity * perKgRate;
    }

    public String getName() {
        return name;
    }

    public double getOrderCost() {
        return orderCost;
    }

    public Fruit getApples(double quantity) {
        return new Fruit("Apples", 100, quantity);
    }

    public Fruit getOranges(double quantity) {
        return new Fruit("Orange", 80, quantity);
    }

    public Fruit getBananas(double quantity) {
        return new Fruit("Banana", 30, quantity);
    }

    public Fruit getKiwis(double quantity) {
        return new Fruit("Kiwi", 120, quantity);
    }

    public double getQuantity() {
        return quantity;
    }
}
