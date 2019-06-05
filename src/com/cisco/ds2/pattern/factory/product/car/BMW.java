package com.cisco.ds2.pattern.factory.product.car;

public class BMW implements ICar {

    @Override
    public ICar produce() {
        ICar car = new BMW();
        System.out.println("produce BMW car.");
        return car;
    }
}
