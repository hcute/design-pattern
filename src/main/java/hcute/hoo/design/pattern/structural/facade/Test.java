package hcute.hoo.design.pattern.structural.facade;

public class Test {
    public static void main(String[] args) {
        PointGift pointGift = new PointGift("TS");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
//        giftExchangeService.setQualifyService(new QualifyService());
//        giftExchangeService.setPointPaymentService(new PointPaymentService());
//        giftExchangeService.setShippingService(new ShippingService());

        giftExchangeService.exchangeGift(pointGift);


    }
}
