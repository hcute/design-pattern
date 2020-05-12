package hcute.hoo.design.principle.interfacesegregation.v0;

public class Bird implements IAnimalAction{
    public void eat() {
        System.out.println("鸟吃虫子");
    }

    public void fly() {
        System.out.println("鸟不应定会飞");
    }

    public void swim() {
        System.out.println("鸟也不应定会游泳");
    }
}
