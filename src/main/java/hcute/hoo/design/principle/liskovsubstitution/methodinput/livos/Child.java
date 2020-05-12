package hcute.hoo.design.principle.liskovsubstitution.methodinput.livos;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {
    @Override
    public void test(HashMap map) {
        System.out.println("子类的hashMap方法被执行");
    }

    public void test(Map map) {
        System.out.println("子类的map方法被执行");
    }
}
