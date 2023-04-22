package com.strr.code;

import com.strr.code.packing.Packing;

public interface Item {
    String name();

    Packing packing();

    float price();
}
