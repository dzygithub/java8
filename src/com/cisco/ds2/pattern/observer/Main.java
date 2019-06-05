package com.cisco.ds2.pattern.observer;

public class Main {
    public static void main(String[] args) {
        Stock house = new Stock("fhtx", 100f);
        People p1 = new People("p1");
        People p2 = new People("p2");

        house.addObserver(p1);
        house.addObserver(p2);

        house.setPrice(111f);
        house.setPrice(112f);
    }
}
