package com.cisco.ds2.pattern.observer;

import java.util.Observable;

public class Stock extends Observable {
    private float price;
    private String name;

    public Stock(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        super.setChanged();
        super.notifyObservers(this);
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("stock name: %s, current price：%.2f", this.name,  this.price) ;
    }
}
