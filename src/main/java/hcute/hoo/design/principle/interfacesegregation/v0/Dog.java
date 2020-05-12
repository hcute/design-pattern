package hcute.hoo.design.principle.interfacesegregation.v0;

public class Dog implements IAnimalAction{
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void fly() {

    }

    public void swim() {
        System.out.println("聪明的狗会游泳");
    }
}
