package hcute.hoo.design.pattern.structural.adapter.classadapter;

public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target target1 = new Adapter();
        target1.request();
    }
}
