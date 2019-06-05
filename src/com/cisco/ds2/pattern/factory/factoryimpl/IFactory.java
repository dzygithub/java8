package com.cisco.ds2.pattern.factory.factoryimpl;

import com.cisco.ds2.pattern.factory.product.car.ICar;
import com.cisco.ds2.pattern.factory.product.tire.ITire;

public interface IFactory {

    ICar car();

    ITire tire();
}
