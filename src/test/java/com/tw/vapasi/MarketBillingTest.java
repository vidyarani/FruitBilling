package com.tw.vapasi;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MarketBillingTest {
    double delta = 0.01;
    @Test
    public void assertCostOfTwoKgAppleIs200() {
        ArrayList<Fruit> list = new ArrayList<Fruit>();
        Fruit fruit = new Fruit();
        list.add(fruit.getApples(2));
        double costOfApples = list.get(0).orderCost;
        Assert.assertEquals(200, costOfApples, delta);
    }

    @Test
    public void assertCostOfOneKgOrangeIs80() {
        ArrayList<Fruit> list = new ArrayList<Fruit>();
        Fruit fruit = new Fruit();
        list.add(fruit.getOranges(1));
        double costOfOranges = list.get(0).orderCost;
        Assert.assertEquals(80, costOfOranges, delta);
    }

    @Test
    public void assertCostOfFourKgBananasIs120() {
        ArrayList<Fruit> list = new ArrayList<Fruit>();
        Fruit fruit = new Fruit();
        list.add(fruit.getBananas(4));
        double costOfBananas = list.get(0).orderCost;
        Assert.assertEquals(120, costOfBananas, delta);
    }

    @Test
    public void assertCostOfOneKgKiwiIs120() {
        ArrayList<Fruit> list = new ArrayList<Fruit>();
        Fruit fruit = new Fruit();
        list.add(fruit.getKiwis(1));
        double costOfKiwis = list.get(0).orderCost;
        Assert.assertEquals(120, costOfKiwis, delta);
    }

    @Test
    public void assertTotalBillOfFruitsIsCorrect() {
        ArrayList<Fruit> orderList = new ArrayList<Fruit>();
        Fruit fruit = new Fruit();
        orderList.add(fruit.getKiwis(1));
        orderList.add(fruit.getBananas(2));
        orderList.add(fruit.getOranges(3));
        orderList.add(fruit.getApples(4));
        Bill bill = new Bill();
        double totalBill = bill.getTotalBill(orderList);
        Assert.assertEquals(820.0, totalBill, delta);
    }
}
