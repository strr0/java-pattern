package com.strr;

import com.strr.code.CustomerFactory;
import com.strr.code.customer.AbstractCustomer;

/**
 * 空对象模式
 * 一个空对象取代 NULL 对象实例的检查
 */
public class Application {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
    }
}
