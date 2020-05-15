package hcute.hoo.design.pattern.creational.prototype.clone;

import java.util.Date;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Pig pig1 = new Pig();
        pig1.setBirthday(new Date(0L));
        pig1.setName("小猪");

        Pig pig2 = (Pig) pig1.clone();

        pig1.setName("小猪1");
        pig1.getBirthday().setTime(666666L);

        System.out.println(pig1);
        System.out.println(pig2);

    }
}
