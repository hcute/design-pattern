package hcute.hoo.design.principle.liskovsubstitution.methodoutput;

import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Base child = new Child();
        Map test = child.test();
        System.out.println(test);
    }
}
