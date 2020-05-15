package hcute.hoo.design.pattern.structural.decorator;

public abstract class AbstractDecorator extends ABatterCake{
    private ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    public String getDesc() {
        return aBatterCake.getDesc();
    }

    @Override
    public int cost() {
        return aBatterCake.cost();
    }
}
