package hcute.hoo.design.pattern.structural.proxy;

public class OrderServiceImpl implements IOrderService {


    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        // spring 会自动注入，我们直接new
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        iOrderDao.insert(order);
        return 1;
    }
}
