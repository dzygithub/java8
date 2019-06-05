package com.cisco.ds2.pattern.factory;

import com.cisco.ds2.pattern.factory.factoryimpl.IFactory;
import com.cisco.ds2.pattern.factory.factoryimpl.ShiYanCarFactory;
import com.cisco.ds2.pattern.factory.product.car.ICar;
import com.cisco.ds2.pattern.factory.product.tire.ITire;

public class Main {

    public static void main(String[] args) {
        IFactory factory = new ShiYanCarFactory();
        ICar car = factory.car();
        ITire tire = factory.tire();
    }
}
