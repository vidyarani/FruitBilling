package com.tw.vapasi;

import java.util.ArrayList;

public class MarketBillingAppMain {
    public static void main(String[] args) {
        ArrayList<Fruit> orderList = buildOrder();
        Bill bill = new Bill();
        bill.printBill(orderList);
    }

    public static ArrayList<Fruit> buildOrder() {
        ArrayList<Fruit> list = new ArrayList<Fruit>();
        Fruit fruit = new Fruit();
        list.add(fruit.getApples(2));
        list.add(fruit.getOranges(1.5));
        list.add(fruit.getBananas(0.5));
        list.add(fruit.getKiwis(0.75));
        return list;
    }

}
