package hcute.hoo.design.pattern.structural.adapter.classadapter;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("Concrete target request");
    }
}
