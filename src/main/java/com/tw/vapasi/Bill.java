package com.tw.vapasi;

import java.util.ArrayList;

public class Bill {

    public double getTotalBill(ArrayList<Fruit> orderList) {
        double totalBillAmount = 0;
        for (Fruit order : orderList) {
            totalBillAmount += order.getOrderCost();
        }
        return totalBillAmount;
    }

    public void printBill(ArrayList<Fruit> orderList) {
        System.out.println("Fruit\tQuantity\tAmount");
        for (Fruit order : orderList) {
            System.out.println(order.getName() + "\t" + order.getQuantity() + "\t\t" + order.orderCost);
        }
        System.out.println("Total Bill Amount:::" + getTotalBill(orderList));
    }
}
