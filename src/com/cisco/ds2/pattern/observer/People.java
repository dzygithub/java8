package com.cisco.ds2.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class People implements Observer {

    private String name;

    public People(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object data) {
        Stock stock = (Stock)data;
        System.out.println("People name: "+ this.name
                + " , stock name: " + stock.getName()
                + " , price: "+ (Float)stock.getPrice());
    }

}
