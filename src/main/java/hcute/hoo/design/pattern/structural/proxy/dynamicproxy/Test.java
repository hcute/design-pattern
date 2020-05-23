package hcute.hoo.design.pattern.structural.proxy.dynamicproxy;

import hcute.hoo.design.pattern.structural.proxy.IOrderService;
import hcute.hoo.design.pattern.structural.proxy.Order;
import hcute.hoo.design.pattern.structural.proxy.OrderServiceImpl;

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        IOrderService iOrderService = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        iOrderService.saveOrder(order);

    }
}
