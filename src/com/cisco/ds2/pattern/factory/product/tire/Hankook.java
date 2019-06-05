package com.cisco.ds2.pattern.factory.product.tire;

public class Hankook implements ITire {

    @Override
    public ITire produce() {
        ITire hankook = new Hankook();
        System.out.println("produce Hankook tire");
        return hankook;
    }
}
