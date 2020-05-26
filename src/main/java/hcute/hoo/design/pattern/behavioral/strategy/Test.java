package hcute.hoo.design.pattern.behavioral.strategy;

import org.apache.commons.lang3.StringUtils;
import org.springframework.aop.target.EmptyTargetSource;

public class Test {

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
//        promotionActivity618.executePromotionStrategy();
//        promotionActivity1111.executePromotionStrategy();
//    }

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//        String promotionKey = PromotionEnum.MANJIAN.name();
//        if (StringUtils.equals(promotionKey,PromotionEnum.MANJIAN.name())){
//            promotionActivity = new PromotionActivity(new ManJianPromotionStrategy());
//        } else if (StringUtils.equals(promotionKey,PromotionEnum.LIJIAN.name())) {
//            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
//        } else if (StringUtils.equals(promotionKey,PromotionEnum.FANXIAN.name())) {
//            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
//        } else {
//            promotionActivity = new PromotionActivity(new EmptyPromotionStrategy());
//        }
//        promotionActivity.executePromotionStrategy();
//    }

    public static void main(String[] args) {
        PromotionActivity promotionActivity =
                new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(PromotionEnum.FANXIAN.name()));
        promotionActivity.executePromotionStrategy();
    }
}
