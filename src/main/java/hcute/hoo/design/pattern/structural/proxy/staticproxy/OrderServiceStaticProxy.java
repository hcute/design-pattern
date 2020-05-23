package hcute.hoo.design.pattern.structural.proxy.staticproxy;

import hcute.hoo.design.pattern.structural.proxy.IOrderService;
import hcute.hoo.design.pattern.structural.proxy.Order;
import hcute.hoo.design.pattern.structural.proxy.OrderServiceImpl;
import hcute.hoo.design.pattern.structural.proxy.db.DataSourceContextHodler;

public class OrderServiceStaticProxy {

    private IOrderService iOrderService;

    public int saveOrder(Order order){
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order){
        Integer userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到 【db"+dbRouter+"】处理数据");
        DataSourceContextHodler.setDBType(String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }

    private void afterMethod(){

        System.out.println("静态代理 after code");
    }
}
