package com.cisco.ds2.pattern.observer;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("fhtx", 100f);
        People p1 = new People("p1");
        People p2 = new People("p2");

        stock.addObserver(p1);
        stock.addObserver(p2);

        stock.setPrice(111f);
        stock.setPrice(112f);
    }
}
