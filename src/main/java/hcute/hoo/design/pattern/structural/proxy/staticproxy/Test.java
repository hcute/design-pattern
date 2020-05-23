package hcute.hoo.design.pattern.structural.proxy.staticproxy;

import hcute.hoo.design.pattern.structural.proxy.Order;

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
