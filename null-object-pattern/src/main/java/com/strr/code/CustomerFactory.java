package com.strr.code;

import com.strr.code.customer.AbstractCustomer;
import com.strr.code.customer.NullCustomer;
import com.strr.code.customer.RealCustomer;

public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
