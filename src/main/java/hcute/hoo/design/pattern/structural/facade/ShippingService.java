package hcute.hoo.design.pattern.structural.facade;

public class ShippingService {

    public String shipGift(PointGift pointGift){
        System.out.println(pointGift.getName() + "进入物流系统");
        return "666";
    }
}
