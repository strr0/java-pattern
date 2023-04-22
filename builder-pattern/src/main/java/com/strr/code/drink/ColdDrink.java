package com.strr.code.drink;

import com.strr.code.Item;
import com.strr.code.packing.Bottle;
import com.strr.code.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
