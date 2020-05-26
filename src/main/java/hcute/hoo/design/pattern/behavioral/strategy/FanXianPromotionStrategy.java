package hcute.hoo.design.pattern.behavioral.strategy;

public class FanXianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现活动，返现的金额存储到用户的慕课网余额中");
    }
}
