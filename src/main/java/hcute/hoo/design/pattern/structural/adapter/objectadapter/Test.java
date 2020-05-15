package hcute.hoo.design.pattern.structural.adapter.objectadapter;

public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Adapter adapter = new Adapter();
        adapter.request();
    }
}
