package com.cisco.ds2.pattern.factory.product.car;

public class Audi implements ICar {
    @Override
    public ICar produce() {
        ICar car = new Audi();
        System.out.println("produce AUdi car.");
        return car;
    }
}
