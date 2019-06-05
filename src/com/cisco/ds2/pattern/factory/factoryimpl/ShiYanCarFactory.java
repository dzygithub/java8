package com.cisco.ds2.pattern.factory.factoryimpl;

import com.cisco.ds2.pattern.factory.product.car.BMW;
import com.cisco.ds2.pattern.factory.product.car.ICar;
import com.cisco.ds2.pattern.factory.product.tire.ITire;
import com.cisco.ds2.pattern.factory.product.tire.Michelin;

public class ShiYanCarFactory implements IFactory {

    @Override
    public ICar car() {
        return new BMW().produce();
    }

    @Override
    public ITire tire() {
        return new Michelin().produce();
    }
}
