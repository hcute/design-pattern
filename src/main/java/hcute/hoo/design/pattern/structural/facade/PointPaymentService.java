package hcute.hoo.design.pattern.structural.facade;

public class PointPaymentService {

    public boolean payment(PointGift pointGift){
        System.out.println("支付" + pointGift.getName() + "积分成功");
        return true;
    }
}
