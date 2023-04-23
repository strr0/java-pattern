package com.strr;

import com.strr.code.Broker;
import com.strr.code.Stock;
import com.strr.code.order.BuyStock;
import com.strr.code.order.SellStock;

/**
 * 命令模式
 * 将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。
 */
public class Application {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();
    }
}
