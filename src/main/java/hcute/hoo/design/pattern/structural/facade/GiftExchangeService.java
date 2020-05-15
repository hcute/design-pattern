package hcute.hoo.design.pattern.structural.facade;


public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();

    private PointPaymentService pointPaymentService = new PointPaymentService();

    private ShippingService shippingService = new ShippingService();

    public QualifyService getQualifyService() {
        return qualifyService;
    }

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public PointPaymentService getPointPaymentService() {
        return pointPaymentService;
    }

    public void setPointPaymentService(PointPaymentService pointPaymentService) {
        this.pointPaymentService = pointPaymentService;
    }

    public ShippingService getShippingService() {
        return shippingService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void exchangeGift(PointGift pointGift){
        if (qualifyService.isAvailable(pointGift)) {
            if (pointPaymentService.payment(pointGift)) {
                String shippingOrderNo = shippingService.shipGift(pointGift);
                System.out.println("物流系统下单成功，订单号是：" + shippingOrderNo);
            }
        }
    }
}
