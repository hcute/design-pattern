package hcute.hoo.design.pattern.behavioral.strategy;

public class ManJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减促销，满100减20元");
    }
}
