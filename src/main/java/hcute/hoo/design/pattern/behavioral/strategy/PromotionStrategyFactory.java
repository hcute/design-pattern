package hcute.hoo.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {

    private static Map<String,PromotionStrategy>  PROMOTION_STRATEGY_MAP = new HashMap<String, PromotionStrategy>();
    private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionEnum.FANXIAN.name(),new FanXianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionEnum.MANJIAN.name(),new ManJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionEnum.LIJIAN.name(),new LiJianPromotionStrategy());
    }

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

}
