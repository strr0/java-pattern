package com.strr.code.burger;

import com.strr.code.Item;
import com.strr.code.packing.Packing;
import com.strr.code.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
