package hcute.hoo.design.pattern.structural.proxy.dynamicproxy;


import hcute.hoo.design.pattern.structural.proxy.Order;
import hcute.hoo.design.pattern.structural.proxy.db.DataSourceContextHodler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {


    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class<?> cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }

    /**
     *
     * @param proxy
     * @param method 被增强的方法
     * @param args 增强方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object arg = args[0];
        beforeMethod(arg);
        Object invoke = method.invoke(target, args);
        afterMethod();
        return invoke;
    }

    private void beforeMethod(Object object) {
        int userId = 0;
        System.out.println("动态代理 before code");
        if (object instanceof Order) {
            Order order = (Order) object;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        DataSourceContextHodler.setDBType("db" + dbRouter);
        System.out.println("动态代理分配【db】"+dbRouter+"数据源");

    }

    private void afterMethod(){
        System.out.println("动态代理 after code");
    }
}
