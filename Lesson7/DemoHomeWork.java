package Lesson7;

import Lesson6.Order;

import java.util.Date;

public class DemoHomeWork {
    Order createOrder() {
        return new Order(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy");
    }

    Order createOrderAndCallMethods() {
        Order newOrder = new Order(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue");
        newOrder.confirmOrder();
        newOrder.checkPrice();
        newOrder.isValidType();
        return newOrder;
    }
}

