package hcute.hoo.design.pattern.structural.decorator;

public class Test {

    public static void main(String[] args) {
        ABatterCake aBatterCake = new BatterCake();
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);
        System.out.println(aBatterCake.getDesc() + "..." + aBatterCake.cost());
    }
}
