package com.cisco.ds2.pattern.factory.product.tire;

public class Michelin implements ITire {

    @Override
    public ITire produce() {
        ITire tire = new Michelin();
        System.out.println("produce Michelin tire.");
        return tire;
    }
}
